/* 
LA FORMULA DI ERONE PER CALCOLARE L'AREA DI UN TRIANGOLO

Se conosciamo le lunghezze a,b,c dei lati di un triangolo, si può calcolare la sua area S con la formula di Erone.
Detta sqrt() la funzione per calcolare una radice quadrata, si può scrivere: 

p = (a + b + c) / 2   => semi perimetro
S = sqrt(p * (p - a) * (p - b) * (p - c))

ESERCIZIO:
Scrivere in Java un programma che chieda all'utente le lunghezze a,b,c dei lati di un triangolo e calcoli l'area S con la formula di Erone.
*/

import java.util.Scanner;

public class AreaTriangolo
{
    static Scanner input = new Scanner(System.in); // creo uno scanner per tutti i metodi

    public static void Calcola(double a, double b, double c)
    {
        double S, p;
        String sRisultato;
        
        p = (a + b + c) /2; //calcolo semiperimetro
        S = Math.sqrt(p * (p-a) * (p-b) * (p-c));

        sRisultato = "L'area del triangolo è " + S;
        System.out.println(sRisultato);
    }

    private static boolean isTriangoloValido(double a, double b, double c) 
    {
        return a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b;
    }

    public static void main(String[] args)
    {
        double a, b, c;

        try
        {
            // input variabili lati triangolo
            System.out.print("Misura lato A? ");
            a = input.nextDouble();
            
            System.out.print("Misura lato B? ");
            b = input.nextDouble();
            
            System.out.print("Misura lato C? ");
            c = input.nextDouble();

            if (isTriangoloValido(a, b, c))
            {
                Calcola(a,b,c);
            }
            else
            {
                System.out.println("Il triangolo non si chiude o i valori inseriti non sono validi.");
            }
        }
        catch (Exception e)
        {
            System.out.print("Il programma ha riscontrato un errore: " + e);
        }
        finally
        {
            input.close();
        }
    }
}