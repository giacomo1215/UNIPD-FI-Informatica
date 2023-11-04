// CONSEGNA Esercizio 2.3 Laboratorio fondamenti informatica A UNIPD 2023
// Scrivere un programma TestDivision che definisca due numeri interi m e n e invii a standard output il risultato e il resto della divisione intera m/n. Compilare e eseguire. Che cosa succede se il divisore vale zero? Scrivere poi un programma che definisca due numeri reali x e y e invii a standard output il risultato della divisione x/y. Compilare ed eseguire. Esegue correttamente? Provare con le coppie di numeri:
// x = 7.0  | y = 0.0
// x = -7.0 | y = 0.0
// x = 0.0  | y = 0.0

import java.util.Scanner;

public class TestDivision 
{
    static Scanner input = new Scanner(System.in); // creo uno scanner per tutti i metodi

    public static void main (String[] args)
    {
        try
        {
            eseguiDivisione();
        }
        finally
        {
            input.close();
        }
    }
    public static void eseguiDivisione() 
    {
        String tipologia;

        System.out.println("Che tipo di divisione vuoi effettuare? (intera o reale)");
        tipologia = input.nextLine();

        switch(tipologia)
        {
            case "intera":
                divisioneIntera();
                break;
            case "reale": 
                divisioneReale();
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }   
    }

    public static void divisioneIntera()
    {
        int dividendoInt;
        int divisoreInt;
        System.out.println("-------------------------");
        System.out.println("--- Divisione  intera ---");
        System.out.println("-------------------------");

        try {
            System.out.print("Inserisci dividendo: ");
            dividendoInt = input.nextInt();

            System.out.print("Inserisci divisore: ");
            divisoreInt = input.nextInt();

            if (divisoreInt == 0)
            {
                System.out.println("Impossibile dividere per zero.");
            }
            else 
            {
                int risultatoIntero = dividendoInt / divisoreInt;
                int resto = dividendoInt % divisoreInt;

                System.out.println("Risultato della divisione intera: " + risultatoIntero);
                System.out.println("Resto della divisione intera: " + resto);
            }
        } catch (Exception e) {
            System.out.println("Input non valido. Assicurati di inserire valori interi validi.");
        }
    }

    public static void divisioneReale()
    {
        System.out.println("-------------------------");
        System.out.println("--- Divisione   reale --- ");
        System.out.println("-------------------------");
        
        double dividendoDouble;
        double divisoreDouble;

        try {
            System.out.print("Inserisci dividendo: ");
            dividendoDouble = input.nextDouble();

            System.out.print("Inserisci divisore: ");
            divisoreDouble = input.nextDouble();

            // Verifica se il divisore è zero
            if (divisoreDouble == 0.0) 
            {
                System.out.println("Impossibile dividere per zero.");
            }
            else 
            {
                double risultatoReale = dividendoDouble / divisoreDouble;
                System.out.println("Risultato della divisione reale: " + risultatoReale);
            }
        } catch (Exception e) {
            System.out.println("Input non valido. Assicurati di inserire valori interi validi.");
        }

    }
}

