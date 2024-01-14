/*
Consegna:
Progettare il programma IsLeapYear che segnali all'utente se il numero intero positivo che ha introdotto corrisponde a un anno bisestile oppure no.
Ricordare che un anno è bisestile se è divisibile per 4. Fanno eccezione gli anni divisibili per 100, che non sono bisestili, e gli anni divisibili per 400, che invece sono bisestili (pur essendo divisibili anche per 100): tali eccezioni esistono però solo dopo l'adozione del calendario gregoriano, che avvenne nel 1582.
Il programma NON dovrà accettare il dato in ingresso (visualizzando, quindi, un messaggio d'errore) quando è un numero intero non positivo.

Provare a risolvere l'esercizio prima senza usare gli operatori booleani (&&, || e !) e poi invece utilizzandoli. Suggerisco di disegnare un diagramma di flusso con le varie diramazioni per chiarirsi le idee prima di scrivere il codice! 
*/

import java.util.Scanner;

public class IsLeapYear
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            System.out.print("What year? ");
            System.out.println();
            int inputYear = in.nextInt();

            vCheckIfLeapYear(inputYear);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            in.close();
        }
    }

    public static void vCheckIfLeapYear(int inputYear)
    {
        if(inputYear > 0)
        {
            vCalculateLeapYear(inputYear);
        }
        else
        {
            System.out.println("Year invalid.");
        }
    }

    public static void vCalculateLeapYear(int inputYear)
    {
        if((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0))
        {
            System.out.println("Year " + inputYear + " is a leap year.");
        }
        else
        {
            System.out.println("Year " + inputYear + " is not a leap year.");
        }
    }
}