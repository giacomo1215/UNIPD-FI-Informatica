/*
Argomento: gestione dinamica di un array unidimensionale, cicli, array bidimensionali

Scrivere il programma IsMagicSquare che verifichi se un quadrato di numeri è un "quadrato magico".

Una disposizione bidimensionale di numeri con dimensione n x n è un quadrato magico se contiene i numeri interi da 1 a n^2 e se la somma degli elementi di ogni riga, di ogni colonna e delle due diagonali principali ha lo stesso valore. 
L'utente introduce i numeri del (presunto) quadrato in sequenza, uno o più numeri per riga, senza alcuna relazione con il numero di righe del quadrato: quando l'utente ha introdotto tutti i numeri e ha chiuso lo standard input, il programma deve intraprendere le azioni seguenti:

    - verifica che il numero di valori introdotti sia il quadrato di un numero intero n: in caso contrario, il programma termina segnalando un fallimento;
    - verifica che la sequenza di valori introdotta contenga tutti (e soli) i numeri da 1 a n^2, senza ripetizioni: in caso contrario, il programma termina segnalando un fallimento (pensate bene a come implementare questo controllo, si puo' fare, anzi si deve fare, solo con quanto visto finora);
    - dispone i valori all'interno di un array bidimensionale, riempito per righe seguendo l'ordine con cui sono stati forniti i valori: il primo valore prende posto nell'angolo in alto a sinistra, il secondo nella seconda posizione da sinistra della prima riga e così via, riempiendo righe successive del quadrato;
    - verifica la validità delle regole del quadrato magico, interrompendo la verifica con la segnalazione di fallimento non appena una regola non sia rispettata;
    - segnala il successo della verifica.

Esempio di input per il primo quadrato:
16 3 2 13 5 10
11 8 9 6 7 12 4
15
14 1
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsMagicSquare
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How big is your square? ");
        
        try
        {
            int n = input.nextInt();
            int[][] square = bidimensionalArray(n);

            System.out.println();

            System.out.println(printArray(square, n));
            System.out.println(testEverything(square, n));
            System.out.println(isMagicSquare(square, n));
        }
        finally
        {
            input.close();
        }

    }

    public static int[][] bidimensionalArray(int size)
    {
        int[][] b = new int[size][];

        for (int i = 0; i < size; i++)
        {
            System.out.println("Insert values for line " + (i + 1));
            b[i] = singleArray(size);
        }

        return b;
    }

    public static int[] singleArray(int size)
    {
        int[] a = new int[size];

        for (int i = 0; i < size; i++)
        {
            boolean validInput = false;
            while(!validInput)
            {
                try
                {
                    a[i] = input.nextInt();
                    validInput = true;
                }
                catch(InputMismatchException e)
                {
                    System.err.println("Insert a valid number please..");
                    input.next(); // Discard the invalid input
                }
            }
        }

        return a;
    }

    public static String printArray(int[][] a, int size)
    {
        String s = "";
        
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                s = s + a[i][j] + " ";
            }
            s = s + "\n";
        }

        return s;
    }

    public static boolean hasAllNumbers(int[][] a, int size) 
    {
        int n = size * size;

        // Create a boolean array to mark the presence of numbers from 1 to n
        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                int currentNumber = a[i][j];

                // Check if the current number is within the valid range
                if (currentNumber >= 1 && currentNumber <= n) 
                {
                    present[currentNumber] = true;
                }
            }
        }

        // Check if all numbers from 1 to n are present
        for (int i = 1; i <= n; i++) 
        {
            if (!present[i]) 
            {
                return false;
            }
        }

        return true;
    }

    public static int verticalSum(int[][] array, int size, int columnIndex)
    {
        int sum = 0;
        for (int i = 0; i < size; i++) 
        {
            sum += array[i][columnIndex];
        }
        return sum;
    }

    public static int horizontalSum(int[][] array, int size, int rowIndex)
    {
        int sum = 0;
        for (int i = 0; i < size; i++) 
        {
            sum += array[rowIndex][i];
        }
        return sum;
    }

    public static int positiveSlantSum(int[][] array, int size)
    {
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += array[i][i];
        }
        
        return sum;
    }
    
    public static int negativeSlantSum(int[][] array, int size)
    {
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += array[i][size - 1 - i];
        }
        
        return sum;
    }

    public static boolean isMagicSquare(int[][] array, int size) 
    {
        int magicConstant = calculateMagicConstant(size);

        for (int i = 0; i < size; i++)
        {
            if (verticalSum(array, size, i) != magicConstant) return false;
            if (horizontalSum(array, size, i) != magicConstant) return false;
        }
        
        if (positiveSlantSum(array, size) != magicConstant) return false;
        if (negativeSlantSum(array, size) != magicConstant) return false;

        return true;
    }

    public static int calculateMagicConstant(int size) {
        return size * (size * size + 1) / 2;
    }

    public static String testEverything(int[][] array, int size)
    {
        String s = "Here are the results: \n";
        for (int i = 0; i < size; i++)
        {
            s += "Sum of column " + (i+1) + ": ";
            s += verticalSum(array, size, i);
            s += "\n";
        }
        
        for (int i = 0; i < size; i++)
        {
            s += "Sum of row " + (i+1) + ": ";
            s += horizontalSum(array, size, i);
            s += "\n";
        }

        s += "Sum of positive slant: " + positiveSlantSum(array, size) + "\n";
        s += "Sum of negative slant: " + negativeSlantSum(array, size);

        return s;
    }


}