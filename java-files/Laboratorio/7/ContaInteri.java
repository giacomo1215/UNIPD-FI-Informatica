/*
Scrivere un programma eseguibile ContaInteri.java che legga da standard input un numero arbitrario di dati e restituisca a standard output il numero di dati letti che sono valori interi. Utilizzare il metodo nextInt() di Scanner per leggere i dati inseriti. Se il dato inserito e' un intero dovra' essere incrementata una variabile contatore precedentemente definita. Nel caso in cui non si inserisca un intero il metodo lancera' l'eccezione InputMismatchException che dovra' essere catturata e gestita. In particolare, al verificarsi dell'eccezione non si dovra' incrementare il contatore ma si dovra' liberare il flusso d'ingresso standard dal dato non valido.

Dopo aver realizzato il programma testarlo con inserimento da tastiera.

Dopo aver visto a lezione il reindirizzamento, testare il programma reindirizzando in input il file contaInteri.txt . Provare poi in entrambi i modi ma reindirizzando l'output nel file numeroInteri.txt. Verificare che il contenuto del file sia corretto con il comando "more numeroInteri.txt" su riga di comando del terminale, oppure aprendo il file numeroInteri.txt con un editor.

N.B. cercare nei JavaDoc il pacakage dell'eccezione InputMismatchException. Potete provare anche ad usare Integer.parseInt(scanner.next()) al posto di scanner.nextInt() e quindi l'eccezione NumberFormatException.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaInteri
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Input anything, let's see if it's an integer! 👀 Use the keyword 'exit' to stop.");
        int integerCount = 0;
        
        try
        {
            while(input.hasNext())
            {
                try
                {
                    String nextInput = input.next();
                    if (nextInput.equalsIgnoreCase("exit")) 
                    {
                        break;
                    }
                    int number = Integer.parseInt(nextInput);
                    integerCount++;
                }
                catch (NumberFormatException e)
                {
                    input.nextLine();
                }
            }
        }
        catch (Exception e)
        {
            System.err.println();
        }
        
        input.close();

        System.out.println("You wrote " + integerCount + " integers.");
    }
}