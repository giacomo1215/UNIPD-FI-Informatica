/* 
Scrivere un programma che:
 - definisca una variabile per memorizzare il valore del raggio di un cilindro pari a 10.12;
 - definisca una variabile per memorizzare il valore dell'altezza di un cilindro pari a 10.87
 - definisca una costante per rappresentare pi-greco come nell'esercizio precedente
 - calcoli il valore dell'area della base del cilindro e lo memorizzi in un'apposita variabile
 - memorizzi il valore del volume del cilindro in una nuova variabile
 - invii a standard output il seguente messaggio:   "***Il volume del cilindro di raggio ... e altezza ... e' pari a ...***"   dove al posto dei caratteri ... ci siano i valori del raggio, dell'altezza e del volume del cilindro.
 NB: Quando sia necessario usare la costante π, non la si definisca come nell'esercizio precedente, ma si usi la costante Math.PI definita nella classe java.lang.Math
*/

import java.util.Scanner;

public class Cilindro
{
    static Scanner input = new Scanner(System.in); // creo uno scanner per tutti i metodi

    public static void main (String[] args)
    {
        String programma;
        try
        {
            System.out.print("Vuoi vedere l'esercizio o calcolare il volume? (Esercizio / Calcola): ");
            programma = input.nextLine();
            programma = programma.toUpperCase();
            switch (programma)
            {
                case "ESERCIZIO":
                    Esercizio();
                    break;
                case "CALCOLA":
                    Calcolatore();
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.print("Il programma ha riscontrato un errore");
        }

        finally
        {
            input.close();
        }
    }

    // esercizio ma interattivo e funzionale
    public static void Calcolatore()
    {
        double raggio, altezza, area, volume;

        System.out.print("Qual'è il raggio del tuo cilindro? ");
        raggio = input.nextDouble();

        System.out.print("Quanto alto è il tuo cilindro? ");
        altezza = input.nextDouble();

        area = Math.PI * Math.pow(raggio, 2);
        volume = area * altezza;

        System.out.print("Il volume del tuo cilindro equivale a " + volume + " unità^2.\n");
    }

    // esercizio come richiesto
    public static void Esercizio()
    {
        double raggio = 10.12;
        double altezza = 10.87;
        double area = Math.PI * (raggio * raggio);
        double volume = area * altezza;
        System.out.println("Il volume del cilindro di raggio " + raggio + " e altezza " + altezza + " equivale a " + volume);
    }
}