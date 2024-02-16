/*
Argomento: ricorsione doppia
Scrivere una classe eseguibile il cui metodo main riceva un numero intero dalla riga di comando, oppure (nel caso in cui non vengano forniti argomenti sulla riga di comando) chieda all'utente un numero intero n, visualizzi l'n-esimo numero di Fibonacci, calcolato usando un algoritmo iterativo.
Scrivere una classe eseguibile RecFib.java il cui metodo main  riceva un numero intero dalla riga di comando, oppure (nel caso in cui non vengano forniti argomenti sulla riga di comando) chieda all'utente un numero intero n visualizzi l'n-esimo numero di Fibonacci, calcolato usando un algoritmo ricorsivo.
Scrivere una classe eseguibile IterFib.java il cui metodo main riceva un numero intero dalla riga di comando, oppure (nel caso in cui non vengano forniti argomenti sulla riga di comando) chieda all'utente un numero intero n
visualizzi l'n-esimo numero di Fibonacci, calcolato usando un algoritmo iterativo.

Si consiglia di scrivere due metodi ausiliari statici, recursiveFib e iterativeFib, invocati da ciascun metodo main della rispettiva classe per realizzare il comportamento sopra indicato. Entrambi i metodi ricevono un parametro n di tipo int e (dopo aver verificato la pre-condizione che n non sia negativo) restituiscono un valore di tipo long che rappresenta l'n-esimo numero Fib( n ) nella sequenza di Fibonacci.
Il metodo recursiveFib calcola il valore da restituire usando la ricorsione doppia, implementando direttamente la definizione della serie.
Il metodo iterativeFib deve calcolare il valore da restituire senza usare la ricorsione e senza usare strutture dati di memorizzazione (ossia senza array, ma usando soltanto variabili semplici).
Nei metodi main invocare System.currentTimeMillis() prima e dopo la chiamata al metodo statico e riportare il tempo di esecuzione. Se i tempi non dovessero essere rilevabili in termini di millisecondi potete utilizzare il metodo System.nanoTime().

Provare a lanciare i due programmi piu' volte (giusto per vedere che i tempi sono simili ma non necessariamente uguali per uno stesso algoritmo e uno stesso n, specie al crescere di n) su input crescente.

Verificare la differenza nell'andamento dei tempi di esecuzione tra i due algoritmi.
*/
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        if (isArgsEmpty(args.length))
        {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.close();
            System.out.println("Using recursiveFib:");
            System.out.println(recursiveFib(number));
            System.out.println("Using iterativeFib:");
            System.out.println(iterativeFib(number));
        }
        else
        {
            int argVal = Integer.parseInt(args[0]);
            System.out.println("Using recursiveFib:");
            System.out.println(recursiveFib(argVal));
            System.out.println("Using iterativeFib:");
            System.out.println(iterativeFib(argVal));
        }
    }

    public static boolean isArgsEmpty(int n)
    {
        if (n == 0) 
        { 
            return true;
        }
        return false;
    }

    public static int recursiveFib(int n)
    {
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            if (i <= 1)
            {
                array[i] = i;
            }
            else
            {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.print(array[i] + " ");
        }

        return array[n-1];
    }

    // Il metodo iterativeFib deve calcolare il valore da restituire senza usare 
    // la ricorsione e senza usare strutture dati di memorizzazione 
    // (ossia senza array, ma usando soltanto variabili semplici).
    public static String iterativeFib(int n)
    {
        String output = "";
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++)
        {
            if (i <= 1)
            {
                output = a + " ";
            }
            else
            {
                int temp  = a;
                a = b;
                b = temp + b;
                output += b + " ";
            }
        }

        return output;
    }
}