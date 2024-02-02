/*
Argomento: lettura da standard input e cicli
Progettare il programma StandardDeviation che chieda all'utente di inserire una sequenza di numeri e ne visualizzi la deviazione standard.
La deviazione standard D si calcola con la formula seguente: 

D = Math.sqrt((A - B*B/n)/(n-1))

dove n è il numero di valori, B è la somma di tutti i valori e A è la somma dei quadrati di tutti i valori. La formula è valida soltanto per n > 1 (per n = 1 la deviazione standard vale 0, per definizione).
Il programma non può far uso di sentinelle né può chiedere all'utente quanto sarà lunga la sequenza: deve continuare a leggere numeri fino a quando non viene chiuso il flusso di ingresso. Il programma deve visualizzare un messaggio d'errore (e niente altro) se il flusso viene chiuso prima che siano stati introdotti almeno due numeri.
*/

import java.util.Scanner;

public class StandardDeviation
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Input values, once done CTRL+D (Mac) or CTRL+Z (Win)");
            CalculateStandardDeviation();
        }
        catch (Exception e)
        {
            System.err.println("Errore: " + e);
        }
        finally
        {
            input.close();
        }
    }

    public static void CalculateStandardDeviation()
    {
        int Count = 0;
        double Sum = 0;
        double PowerSum = 0;
        double StandardDeviation = 0;

        while(input.hasNext())
        {
            try
            {
                double Number = Double.parseDouble(input.next());
                Count++;
                Sum += Number;
                PowerSum += Math.pow(Number, 2);
            }
            catch(NumberFormatException e)
            {
                System.err.println("Error: input is not a number");
            }
            
        }
        
        if(Count > 1)
        {
            StandardDeviation = Math.sqrt((PowerSum - ((Sum * Sum) / Count)) / (Count - 1));
        }
        else
        {
            StandardDeviation = 0;
        }
        
        PrintValue("Standard Deviation", StandardDeviation);
    }

    public static void PrintValue(String name, double value)
    {
        System.out.println(name + ": " + value);
    }

}