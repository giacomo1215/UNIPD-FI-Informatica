/*
CONSEGNA:
Progettare il programma TwoNumbers che chieda all'utente di inserire due numeri reali e ne visualizzi (senza usare la classe Math):

    •    la somma
    •    il prodotto
    •    il valore medio
    •    il valore massimo
    •    il valore minimo
    •    il valore assoluto della differenza
*/

import java.util.Scanner;
public class TwoNumbers
{
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inserire il primo numero: ");
            int iFirstNumber = in.nextInt();

            System.out.println("Inserire il secondo numero: ");
            int iSecondNumber = in.nextInt();

            System.out.println("Somma: " + iSum(iFirstNumber, iSecondNumber));
            System.out.println("Differenza: " + iDifference(iFirstNumber, iSecondNumber));
            System.out.println("Media: " + iAverage(iFirstNumber, iSecondNumber));
            System.out.println("Massimo: " + iMax(iFirstNumber, iSecondNumber));
            System.out.println("Minimo: " + iMin(iFirstNumber, iSecondNumber));
            System.out.println("Differenza assoluta: " + iAbsDifference(iFirstNumber, iSecondNumber));

        }
        catch (Exception e)
        {
            System.out.println("Errore: " + e);
        }
        finally
        {
            in.close();
        }
    }

    public static int iSum(int iFirstNumber, int iSecondNumber)
    {
        return iFirstNumber + iSecondNumber;
    }

    public static int iDifference(int iFirstNumber, int iSecondNumber)
    {
        return iFirstNumber - iSecondNumber;
    }

    public static int iAverage(int iFirstNumber, int iSecondNumber)
    {
        return (iFirstNumber + iSecondNumber) / 2;
    }

    public static int iMax(int iFirstNumber, int iSecondNumber)
    {
        if (iFirstNumber > iSecondNumber)
        {
            return iFirstNumber;
        }
        else
        {
            return iSecondNumber;
        }
    }

    public static int iMin(int iFirstNumber, int iSecondNumber)
    {
        if (iFirstNumber < iSecondNumber)
        {
            return iFirstNumber;
        }
        else
        {
            return iSecondNumber;
        }
    }

    public static int iAbsDifference(int iFirstNumber, int iSecondNumber)
    {
        if (iFirstNumber > iSecondNumber)
        {
            return iFirstNumber - iSecondNumber;
        }
        else
        {
            return iSecondNumber - iFirstNumber;
        }
    }

}