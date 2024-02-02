/*
Argomento: Manipolazione di stringhe e caratteri, cicli annidati

Scrivere un programma che

    chiede all'utente di introdurre due stringhe (una per riga), s1 e s2; ciascuna stringa è costituita da tutti i caratteri presenti sulla riga, compresi eventuali spazi iniziali, finali e/o intermedi
    verifica se la seconda stringa, s2, è una sottostringa di s1, ossia se esiste una coppia di numeri interi, x e y, per cui s1.substring(x, y) restituisce una stringa uguale a s2 (al termine della verifica viene visualizzato un messaggio opportuno)

Soluzione 1: Il programma puo' usare solo i metodi length(), substring(...) ed equals(...) della classe String.
Soluzione 2: Il programma puo' usare solo i metodi charAt() e length() della classe String.

Verificare che il programma gestisca correttamente la situazione in cui s2 è la stringa vuota (che, in base alla definizione precedente, è sottostringa di qualsiasi stringa).
*/

import java.util.Scanner;

public class StringManipulation
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Input first string");
        String s1 = input.nextLine();
        System.out.println("Input second string");
        String s2 = input.nextLine();
        input.close();

        System.out.println(CheckMatch(s1, s2));
    }

    public static boolean IsShorter(String s1, String s2)
    {
        if(s2.length() < s1.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String CheckMatch(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i <= len1 - len2; i++)
        {
            if (s1.substring(i, i + len2).equals(s2))
            {
                return "La stringa " + s2 + " è presente.";
            }
        }
        return "La stringa non è presente.";
    }
}