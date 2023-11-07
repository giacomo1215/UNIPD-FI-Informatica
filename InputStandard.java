/*
Argomento: uso dell'input standard

Scrivere un programma che

acquisisca da standard input una riga contenente tre parole o token (ovvero tre stringhe separate da un carattere di spaziatura), non serve controllare che nella riga ci siano piu' di tre parole, cioe' dopo aver letto i 3 token essi vengono stampati ignorando eventuali caratteri extra.
stampi le tre parole a standard output, una per riga nell'ordine in cui sono state acquisite
Esempio: se si introduce la stringa uno due tre, l'esecuzione della classe produce le seguenti stampe:

uno
due
tre
*/

import java.util.Scanner;

public class InputStandard
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        try
        {
            System.out.print("Inserisci una stringa di testo: ");
            String sTesto = input.nextLine();

            // metto ogni parola ad una riga separata
            sTesto = sTesto.replace(" ", "\n");

            System.out.println(sTesto);
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        finally
        {
            input.close();
        }
    }
}