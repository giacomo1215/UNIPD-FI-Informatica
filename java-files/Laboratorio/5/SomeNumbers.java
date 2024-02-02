/* CONSEGNA
Progettare il programma SomeNumbers che chieda all'utente di inserire una sequenza di numeri e ne visualizzi:

la somma
la somma dei valori assoluti
il prodotto
il valore medio

Il programma non può far uso di sentinelle né può chiedere all'utente quanto sarà lunga la sequenza: deve continuare a leggere numeri fino a quando non viene chiuso il flusso di ingresso.
Il programma deve visualizzare un messaggio d'errore (e niente altro) se il flusso viene chiuso prima che siano stati introdotti almeno due numeri.
*/
import java.util.Scanner;

public class SomeNumbers
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            compute();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        finally
        {
            in.close();
        }
    }

    public static void compute()
    {
        System.out.println("Inserisci una sequenza di numeri. Per interrompere, chiudi il flusso di input. (CTRL+D per Mac, CTRL+Z per Windows)");

        int count = 0;
        double sum = 0;
        double absSum = 0;
        double product = 1;

        while(in.hasNext())
        {
            try
            {
                double number = Double.parseDouble(in.next());
                count++;
                sum += number;
                absSum += Math.abs(number);
                product *= number;
            }
            catch (NumberFormatException e)
            {
                System.err.println("Errore: Inserisci un numero valido.");
            }
        }
        
        if (count < 2)
        {
            System.err.println("Errore: devono essere introdotti almeno due numeri.");
        }
        else
        {
            double average = sum / count;
            
            displayResult("Somma", sum);
            displayResult("Somma assoluta", absSum);
            displayResult("Prodotto", product);
            displayResult("Media", average);
        }


    }

    public static void displayResult(String type, double value)
    {
        System.out.println(type + ": " + value);
    }

}