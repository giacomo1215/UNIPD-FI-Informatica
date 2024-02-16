/*
Argomento: gestione delle eccezioni; uso della terminazione di input; lettura/scrittura  file

Scrivere il programma Leggi3.java modificando il programma precedente in modo che i segni di punteggiature (virgola e punto di domanda) vengano considerati come separatori. Per far cio' sara' necessario invocare il metodo useDelimiter passando come parametro la stringa "[,?\\s]+". Il contenuto della stringa viene chiamato "espressione regolare". In sostanza stiamo dicendo di considerare come separatori la virgola, il punto di domanda e tutti gli spazi (\\s) ripetuti almento una volta (il + dopo la parentesi quadra). Le espressioni regolari sono un argomento avanzato che esula dal programma del corso.
Pero' possiamo facilmente creare dei separatori, ad esempio provate a definire come separatore la sola lettera "o" e vedere come si separa la frase.
*/
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read3
{
    public static final String delimiter = "[,?\\s]+";

    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("input2.txt");
            Scanner input = new Scanner(reader);

            input.useDelimiter(delimiter);

            while(input.hasNext())
            {
                String word = input.next();
                System.out.print(word);
            }

            input.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found." + e.getMessage());
        }
    }
}