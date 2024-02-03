/*
Argomento: gestione dinamica di un array, cicli
Leggere un numero arbitrario di interi da standard input e riportarli in uscita in ordine inverso di inserimento.
*/

import java.util.Scanner;

public class InvertArrayOrder
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.print("How big do you want the array to be? ");
        int size = input.nextInt();

        System.out.println(invertArray(userArray(size)));
        input.close();
    }

    public static int[] userArray(int n)
    {
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = input.nextInt();
        }

        return a;
    }

    public static String invertArray(int[] a)
    {
        String s = "[ ";

        for (int i = a.length - 1; i >= 0; i--)
        {
            s = s + a[i] + " ";
        }
        s = s + "]";

        return s;
    }
}