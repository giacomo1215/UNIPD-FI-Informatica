/*
Realizzare la classe ArrayUtil che contiene al suo interno il metodo resize visto in classe, con l'aggiunta della possibilita' che il valore del parametro esplicito newLength sia minore di quella dell'array. In questo caso restituire un array con lo stesso contenuto (fino alla nuova dimensione) e troncato alla dimensione indicata.
Realizzare una versione di resize che ridimensiona un array di int e una che ridimensiona un array di double. Il nome del metodo puo' rimanere invariato. Questa proprieta' si chiama "sovraccarico". Il compilatore e' in grado di distinguere tra le due in base al tipo di parametro passato.
*/
import java.util.Scanner;

public class ArrayUtil
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What length do you want your array to be? ");
        int length = input.nextInt();
        double originalArray[] = randomDoubleArray(length, length);
        System.out.println();
        printArray(originalArray);
        System.out.println();
        System.out.print("What length do you want your array to resize to? ");
        int newLength = input.nextInt();
        printArray(resizeArray(originalArray, newLength));
    }

    public static double[] randomDoubleArray(int length, int n)  
    {  
        double[] a = new double[length];  
        for (int i = 0; i < a.length; i++)  
        {
            a[i] = (int) (n * Math.random());  
        }
        return a;  
    }

    public static double[] resizeArray(double[] oldArray, int newLength)
    {
        double newArray[] = new double[newLength];
        if (oldArray.length < newLength)
        {
            for (int i = 0; i < newArray.length - oldArray.length; i++)
            {
                newArray[i] = oldArray[i];
            }
        }
        else
        {
            for (int i = 0; i < newArray.length; i++)
            {
                newArray[i] = oldArray[i];
            }
        }
        return newArray;
    }

    public static void printArray(double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + ", ");
        }
    }
}