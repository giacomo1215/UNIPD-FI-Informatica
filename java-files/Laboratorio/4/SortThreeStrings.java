/*
CONSEGNA:
Argomento: decisioni, confronto tra stringhe

Progettare il programma SortThreeStrings che
    •    chieda all'utente di inserire tre stringhe (una per riga)
    •    visualizzi le stringhe in ordine lessicografico crescente (una per riga)
*/

import java.util.Scanner;

public class SortThreeStrings
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            vGatherStrings();
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

    public static void vGatherStrings()
    {
        System.out.print("Inserisci la prima stringa di testo: ");
        String sFirstString = in.nextLine();
        System.out.print("Inserisci la seconda stringa di testo: ");
        String sSecondString = in.nextLine();
        System.out.print("Inserisci la terza stringa di testo: ");
        String sThirdString = in.nextLine();

        vSortStrings(sFirstString, sSecondString, sThirdString);
    }

    public static void vSortStrings(String sFirstString, String sSecondString, String sThirdString)
    {
        if (sFirstString.compareTo(sSecondString) < 0 && sFirstString.compareTo(sThirdString) < 0)
        {
            System.out.println(sFirstString);
            if (sSecondString.compareTo(sThirdString) < 0)
            {
                System.out.println(sSecondString);
                System.out.println(sThirdString);
            }
            else
            {
                System.out.println(sThirdString);
                System.out.println(sSecondString);
            }
        }
        else if (sSecondString.compareTo(sFirstString) < 0 && sSecondString.compareTo(sThirdString) < 0)
        {
            System.out.println(sSecondString);
            if (sFirstString.compareTo(sThirdString) < 0)
            {
                System.out.println(sFirstString);
                System.out.println(sThirdString);
            }
            else
            {
                System.out.println(sThirdString);
                System.out.println(sFirstString);
            }
        }
        else
        {
            System.out.println(sThirdString);
            if (sFirstString.compareTo(sSecondString) < 0)
            {
                System.out.println(sFirstString);
                System.out.println(sSecondString);
            }
            else
            {
                System.out.println(sSecondString);
                System.out.println(sFirstString);
            }
        }
    }
}