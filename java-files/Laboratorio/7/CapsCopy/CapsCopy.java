/*
Argomento: Lettura e scrittura di file, gestione delle eccezioni, "tokenizzazione" di stringhe

Scrivere un programma CapsCopier.java che

Riceva dall'input standard due nomi di file di testo, uno in lettura e uno in scrittura
Apra in lettura il primo file e ne legga il contenuto
Crei e apra in scrittura il secondo file
Copi nel secondo file il contenuto del primo, opportunamente modificato in modo che tutte le parole abbiano la prima lettera maiuscola e le seguenti minuscole
Provare il programma usando il file vispateresa.txt come file di input e creando (ad esempio) il file vispateresa2.txt in output.
Approfondimento: modificare il programma in modo che riconosca come due parole distinte anche quelle separate da un apostrofo. Ad esempio, se il file in lettura contiene le parole 

LA vispA teresa AVEA tra l'erBETTa
al termine dell'esecuzione il secondo file dovra` contenere il testo

La Vispa Teresa Avea Tra L'Erbetta
Suggerimento importante: studiare la documentazione di Scanner, e verificare che usando opportuni metodi è possibile usare un insieme di caratteri delimitatori diverso da quello di default.
*/

import java.io.*;
import java.util.*;

public class CapsCopy
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Usage: java CapsCopy inputFile outputFile");
            return;
        }

        String inputFile  = args[0];
        String outputFile = args[1];

        try 
        {
            Scanner scanner     = new Scanner(new File(inputFile));
            FileWriter writer   = new FileWriter(outputFile);
            PrintWriter out     = new PrintWriter(writer);

            while(scanner.hasNext())
            {
                String word = scanner.next();
                String capitalizedWord = capitalizeWord(word);
                out.print(capitalizedWord + " ");
            }

            out.flush();
            out.close();
            scanner.close();

        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String capitalizeWord(String word)
    {
        if(word.isEmpty())
        {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
}