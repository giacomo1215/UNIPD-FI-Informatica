/*
Argomento: ricorsione semplice, argomenti sulla riga di comando

Scrivere una classe eseguibile che verifica se una stringa, fornita come parametro sulla riga di comando, e` palindroma. La verifica che una stringa sia o meno una palindroma deve essere realizzata con un algoritmo ricorsivo.
Si ricordi che una stringa e` una palindrome se e` composta da una sequenza di caratteri (anche non alfabetici) che possa essere letta allo stesso identico modo anche al contrario (es. "radar", "anna", "inni", "xyz%u%zyx").

Attenzione: Il programma NON deve avere alcun costrutto iterativo (cioe` non deve avere cicli).
Verificare il corretto funzionamento del programma con:

la stringa "omordotuanuoraoarounautodromo"
una stringa palindroma di lunghezza pari
una stringa palindroma di lunghezza dispari
una stringa non palindroma di lunghezza pari
una stringa non palindroma di lunghezza dispari
una stringa di lunghezza unitaria (che è ovviamente palindroma)
una stringa di lunghezza zero (che è ragionevole definire palindroma); per fornire come parametro sulla riga di comando una stringa di lunghezza zero si indica il parametro ""
*/
import java.util.Scanner;

public class Palindrome
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Input your string:");
            String inputString = input.nextLine();
            System.out.println(isPalindrome(inputString));
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e);
        }
        finally
        {
            input.close();
        }
    }

    public static boolean isPalindrome(String s)
    {
        if (s.length() <= 1)
        {
            return true;
        }

        return (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1)));
    }
}