/*
LABORATORIO 3.2
Obiettivo: esercitarsi con operazioni divisione e modulo fra interi
Scrivere un programma che converta un numero intero in base 10 in una base qualsiasi 𝑏>1. Si scelga il numero da convertire nell'intervallo chiuso [0,𝑏3−1] in modo che sia esprimibile con tre cifre nella nuova base. La base 𝑏 e il numero da convertire vanno dichiarati come variabili intere nel codice, dove potete assegnare loro un valore. Esempio se la base scelta e' 7, si scelga il numero fra 0 e 342(73=343). 

Suggerimento per l'algoritmo da usare: algoritmo di conversione da base decimale a base generica 𝑏 (invece che dividere per 2, come visto in classe per il caso binario, si divide per 𝑏). Verificare il risultato: ad esempio se il numero decimale e' 256 e la base b=7: 25610 = 5147 = 5*72 + 1*71 + 4*70
Dopo aver provato con valori di variabili assegnati direttamente nel codice sorgente, modificare il programma in modo che la base e il valore decimale da convertire vengano specificati dall'utente da standard input e non fissati nel codice.
*/

import java.util.Scanner;

public class ConversioneBase
{
    // initializing scanner for user input
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            // I ask user the base and declare it
            System.out.print("What base we working with? "); 
            int iBase = input.nextInt();

            // I calculate the limit number user can input
            double iValueLimit = Math.pow(iBase, 3) - 1;

            // I ask the value to be converted, making sure it's within b^3-1
            System.out.print("What number do you want to convert, ranging from 0 to " + iValueLimit + "? ");
            int iValue = input.nextInt();

            if (iValue <= iValueLimit) 
            {
                int iThird = iValue % iBase;
                int iRemain = iValue / iBase;

                int iSecond = iRemain % iBase;
                iRemain = iRemain / iBase;

                int iFirst = iRemain % iBase;

                System.out.println("The number " + iValue + " in base 10 equals to " + iFirst + "" + iSecond + "" + iThird);
            }
        }
        catch (Exception e)
        {
            System.out.println("C'è stato un errore: " + e.getMessage());
        }
        finally
        {
            input.close();
        }
    }
}