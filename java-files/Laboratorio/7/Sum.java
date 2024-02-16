/*
 * Esercizio 8
 * Argomento: ricorsione semplice, argomenti sulla riga di comando, lancio/cattura di eccezioni
 * Scrivere una classe eseguibile avente il funzionamento seguente:
 * 
 * se sulla linea di comando vengono forniti due o piu' parametri, oppure nessun parametro, il 
 * programma termina con una segnalazione di errore altrimenti 
 * se il parametro fornito non è un numero intero positivo, il programma termina con una segnalazione 
 * di errore se il parametro ricevuto e' un numero intero positivo, il programma visualizza sull'uscita la somma 
 * dei primi n numeri interi calcolata con un algoritmo ricorsivo. 
 */
public class Sum
{
    public static void main(String[] args)
    {  
    
        // Check the number of command line arguments and prints an error message if the number is invalid.
        if(args.length == 0 || args.length >= 2)
        {
            System.err.println("Invalid arguments! Try again.");
            return;
        }
        
        try
        {
            // Check the command line argument if it's a positive integer
            int argVal = Integer.parseInt(args[0]);
            if (argVal < 0)
            {
                System.err.println("Invalid Argument. Try again.");
                return;
            }

            System.out.println(sumValues(argVal, 0));
        }
        catch (NumberFormatException e)
        {
            System.err.println("Number should be an integer.");
        }
        
    }

    public static int sumValues(int number, int currentSum)
    {
        if (number <= 0)
        {
            return currentSum;
        }
        
        return sumValues(number - 1, currentSum + number);
    }
}