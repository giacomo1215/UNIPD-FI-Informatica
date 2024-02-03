/*
Argomento: Array, cicli
Chiedere all'utente di inserire un numero intero. Leggere due serie di numeri in virgola mobile di lunghezza pari all'intero specificato. Ciacun numero della serie deve essere specificato in una riga di input (= premere invio dopo ogni numero inserito). Restituire in uscita la somma di ciascuna componente corrispondente e la somma totale.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySum
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {      
        try
        {
            System.out.print("How big should the array be? ");
            int size = input.nextInt();
            
            System.out.println("Fill it in..");
            double[] a = generateDoubleArray(size);

            System.out.println("Fill in the second one now..");
            double[] b = generateDoubleArray(size);
            
            System.out.println("Operations: " + calculate(a, b, size));
        }
        catch(InputMismatchException e)
        {
            System.err.println("Insert a valid number!");
        }
        finally
        {
            input.close();
        }
    }

    public static double[] generateDoubleArray(int size)
    {
        double[] a = new double[size];

        for (int i = 0; i < a.length; i++)
        {
            try
            {
                a[i] = input.nextDouble();
            }
            catch(InputMismatchException e)
            {
                System.err.println("Devi inserire un numero");
            }
        }

        return a;
    }
    
    public static String calculate(double[] a, double[] b, int size)
    {
        double sumA = 0;
        double sumB = 0;
        String s = "Sum between values: ";

        for (int i = 0; i < size; i++)
        {
            sumA += a[i];
            sumB += b[i];
            s = s + (a[i] + b[i]) + " ";
        }

        s = s + "\n";
        s = s + "Sum of array 1: " + sumA + "\n";
        s = s + "Sum of array 2: " + sumB + "\n";
        s = s + "Sum of arrays: " + (sumA + sumB);

        return s;
    }
}