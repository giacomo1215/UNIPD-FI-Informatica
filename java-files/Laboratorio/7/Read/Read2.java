/*
Scrivere un programma Leggi2.java che legga il file input.txt una riga alla volta e stampi le parole contenute in ciascuna riga a video una sotto l'altra.

Ad esempio con file input.txt:

ciao, come stai?
io bene e tu?
Stampera' in output:

ciao,
come
stai?
io
bene
e
tu?

Suggerimento: ricordarsi che lo scanner puo' essere utilizzato anche per estrarre "token" da una stringa! Quindi una volta letta la riga da file e' possibile creare un altro scanner passando come argomento la stringa e usare i metodi di scanner per stampare una parola alla volta
*/
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read2
{
    public static void main(String[] args)
    {
        try
        {
            FileReader r = new FileReader("input2.txt");
            Scanner scan = new Scanner(r);
            
            while(scan.hasNext())
            {
                String word = scan.next();
                System.out.println(word);
            }
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found.");
        }
    }
}