/*
Argomento: lettura da standard input, decisioni e cicli
Scrivere il programma EuclideMCD che calcoli il massimo comun divisore (MCD) di due numeri interi positivi m e n acquisiti da standard input e lo visualizzi sul flusso di uscita standard.

Si usi il noto Algoritmo di Euclide per il calcolo del MCD di due numeri interi positivi m ed n (con m > n):
Finchè il resto della divisione di m per n è diverso da zero
il nuovo valore di m è uguale al precedente valore di n
il nuovo valore di n è uguale al resto della divisione del precedente valore di m per il precedente valore di n
Il MCD è l'attuale valore di n


PSEUDOCODICE:
inizia
    leggi (a, b)
    mentre b > 0 fai:
        r <- mod(a, b)
        a <- b
        b <- r
    fine ciclo
    scrivi (a, "è il massimo comun divisore cercato")
finisci.
*/
import java.util.Scanner;

public class EuclideMCD
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        try
        {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(MCD(a, b) + " è il massimo comun divisore cercato");
        }
        catch(Exception e)
        {
            System.err.println("Error: " + e);
        }
        finally
        {
            input.close();
        }
    }

    public static int MCD(int a, int b)
    {
        int r;
        while (b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        
        return Math.abs(a);
    }
}