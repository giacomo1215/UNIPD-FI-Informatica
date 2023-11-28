/* Piccolo esercizio per far pratica con gli array */
import java.util.Scanner;

public class copyArray
{
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        try
        {
            // chiedo all'utente quanto grande vuole che sia l'array
            System.out.println("Quanto grande vuoi che sia l'array? ");
            int dim = console.nextInt();
            console.nextLine();

            // creo l'array
            vCreateArray(dim);

            // creo se si vuole copiare l'array
            System.out.println("Vuoi clonare l'array?");
            String sCopia = console.nextLine();
            sCopia = sCopia.toUpperCase();
            switch(sCopia)
            {
                case "S":
                    System.out.println("Il tuo array contiene:");
                    vReadArray(aValues);
                    System.out.println();
                    System.out.println("Il tuo array clonato contiene:");
                    vCopyArray(dim);
                    break;
                case "N":
                    System.out.println("Il tuo array è:");
                    vReadArray(aValues);
                    break;
                default:
                    System.out.println("Errore.");
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally
        {
            console.close();
        }
    }
    // apro i due array, l'originale e quello da copiare
    public static double[] aValues;
    public static double[] aCopiedValues;

    // routine per creare l'array in base alla dimensione specificata dall'utente
    public static void vCreateArray(int dim)
    {
        aValues = new double[dim];
        for (int i = 0; i < aValues.length; i++)
        {
            System.out.println("Introduci un valore");
            aValues[i] = console.nextDouble();
        }
        console.nextLine();
    }

    // routine per leggere l'array
    public static void vReadArray(double[] aArrayToRead)
    {
        for (int i = 0; i < aArrayToRead.length; i++)
        {
            System.out.print(aArrayToRead[i] + ", ");
        }
        System.out.println();
    }

    
    // routine per copiare l'array originale in uno nuovo copiato
    public static void vCopyArray(int dim)
    {
        aCopiedValues = new double[dim];
        for (int i = 0; i < aValues.length; i++)
        {
            aCopiedValues[i] = aValues[i];
        }
        vReadArray(aCopiedValues);
    }
    
}