/*
Scrivere il programma PrintEasterDayForYear che calcoli la data della domenica di Pasqua di un anno specifico (dichiarare una variabile di tipo intero e assegnarle il valore dell'anno che volete utilizzare). La domenica di Pasqua è la prima domenica dopo la prima luna piena di primavera e la sua data può essere calcolata con questo algoritmo, individuato da Carl Friedrich Gauss nel 1800.
   - Parti dal valore assegnato all'anno y, un numero intero non negativo
   - Dividi y per 19, ottenendo il resto a. Ignora il quoziente.
   - Dividi y per 100, ottenendo quoziente b e resto c.
   - Dividi b per 4, ottenendo quoziente d e resto e.
   - Dividi (8b+13) per 25, ottenendo il quoziente g. Ignora il resto.
   - Dividi (19a+b-d-g+15) per 30, ottenendo il resto h. Ignora il quoziente.
   - Dividi c per 4, ottenendo quoziente j e resto k.
   - Dividi (a+11h) per 319, ottenendo il quoziente m. Ignora il resto.
   - Dividi (2e+2j-k-h+m+32) per 7, ottenendo il resto r. Ignora il quoziente.
   - Dividi (h-m+r+90) per 25, ottenendo il quoziente n. Ignora il resto.
   - Dividi (h-m+r+n+19) per 32, ottenendo il resto p. Ignora il quoziente.
   - Pasqua è il giorno p del mese n dell'anno y. 
Dopo aver provato con valori di variabili assegnati direttamente nel codice sorgente, modificare il programma in modo che l'anno y venga specificato dall'utente leggendolo da standard input e non fissato nel codice.
*/

import java.util.Scanner;

public class PrintEasterDayForYear
{
    static Scanner input = new Scanner(System.in); // creo uno scanner per tutti i metodi
    public static void main(String[] args)
    {
        try
        {
            int iAnnoY;
            
            // chiedo all'utente l'anno richiesto
            System.out.print("Anno? ");
            iAnnoY = input.nextInt();

            // se anno è positivo
            if(iAnnoY > 0) 
            {
                vCalcolaGiorno(iAnnoY);
            }
            else
            {
                System.out.println("Errore, anno non valido");
            }
        }

        // se il programma ha un errore
        catch(Exception e)
        {
            System.out.println(e); // stampa errore
        }

        // una volta finito il programma
        finally 
        {
            input.close(); // chiudo scanner
        }
    }
    
    public static void vCalcolaGiorno(int iAnnoY)
    {
        int a = iAnnoY % 19;
        int b = iAnnoY / 100;
        int c = iAnnoY % 100;
        int d = b / 4;
        int e = b % 4;
        int g = ((8 * b) + 13) / 25;
        int h = ((19 * a) + b - d - g + 15) / 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;

        System.out.println("Pasqua nel " + iAnnoY + " cade il " + p + " di " + vNomeMese(n));
    }

    public static String vNomeMese(int iMese)
    {
        String sMese;
        switch (iMese)
        {
            case 1:
                sMese = "Gennaio";
                break;
            case 2:
                sMese = "Febbraio";
                break;
            case 3:
                sMese = "Marzo";
                break;
            case 4:
                sMese = "Aprile";
                break;
            case 5:
                sMese = "Maggio";
                break;
            case 6:
                sMese = "Giugno";
                break;
            case 7:
                sMese = "Luglio";
                break;
            case 8:
                sMese = "Agosto";
                break;
            case 9:
                sMese = "Settembre";
                break;
            case 10:
                sMese = "Ottobre";
                break;
            case 11:
                sMese = "Novembre";
                break;
            case 12:
                sMese = "Dicembre";
                break;
            default:
                sMese = "input invalido";
        }

        return sMese;
    }
}