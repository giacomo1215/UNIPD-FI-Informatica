/*
CONSEGNA:
Argomento: lettura da input, decisioni, confronto tra numeri

Progettare il programma EvenNumber che:
    •    chieda all'utente di fornire un numero pari (ovviamente intero...)
    •    se il numero fornito è dispari, chieda di nuovo all'utente di fornire un numero pari, dopo aver visualizzato una segnalazione d'errore
    •    se il numero fornito (al primo o secondo tentativo) è pari, scriva un messaggio di congratulazioni all'utente, riportando anche il numero fornito (es. "Bravo! Il numero 26 è pari")
    •    se, invece, neanche il secondo numero fornito è pari, scriva un messaggio di disappunto
Attenzione: se il primo numero fornito è pari, il programma NON deve chiedere un secondo numero.

*/
import java.util.Scanner;
public class EvenNumber
{
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        try
        {
            GatherNumber();
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

    public static void GatherNumber()
    {
        System.out.print("Inserisci un numero: ");
        int iNumber = in.nextInt();
        Check(iNumber);
    }

    public static void Check(int iNumber)
    {
        if (iNumber % 2 != 0)
        {
            System.out.println("Il numero è dispari..");
            GatherNumber();
        }
        else
        {
            System.out.println("Bravo! Il numero " + iNumber + " è pari");
        }
    }
}