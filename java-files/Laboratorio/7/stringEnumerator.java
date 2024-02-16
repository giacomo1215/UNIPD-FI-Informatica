/*
Argomento: enumerazione delle parole di una stringa tramite Scanner

Acquisire da standard input una stringa composta da piu' parole tramite un oggetto di tipo Scanner che chiamerete console e il metodo nextLine().

Creare un nuovo scanner che chiamerete scan utilizzando il costruttore che prende come argomento una stringa e passandogli come argomento la stringa letta da standard input.

Elencare una sotto l'altra le parole che compongono la stringa utilizzando i metodi hasNext() e next() sull'oggetto Scanner scan.


N.B. Lo scopo dell'esercizio e' usare la classe Scanner al di fuori dello standard input, denominata anche tokenizer, e per questo vanno usate due instanze della classe Scanner, una dedicata alla lettura da standard input ed una dedicata alla lettura dalla stringa precedentemente letta da standard input. L'esercizio si differenza da quello del laboratorio precedente in quanto non bisogna usare CTRL+D per terminare il buffer di input.
*/
import java.util.Scanner;

public class stringEnumerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        Scanner scan = new Scanner(inputString);
        System.out.println("Here's all the words contained in the string");

        while(scan.hasNext())
        {
            String word = scan.next();
            System.out.println(word);
        }
        input.close();
        scan.close();
    }
}