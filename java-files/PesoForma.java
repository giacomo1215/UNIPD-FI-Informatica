/* 
PREMESSA
Supponiamo che il peso forma in kg di una persona si possa calcolare sottraendo 105 dalla statura espressa in cm

ESERCIZIO
Realizzare in Java un programma che chieda all'utente la statura in cm, il peso in kg e stabilisca se vi à sovrappeso, sottopeso, normopeso.
*/

import java.util.Scanner;

public class PesoForma
{
    static Scanner input = new Scanner(System.in); // creo uno scanner per tutti i metodi
    final static int I_COSTANTE_IDEALE = 105;

    public static void VerificaPeso(double dUserHeight, double dUserWeight)
    {
        double dPesoIdeale = dUserHeight - I_COSTANTE_IDEALE;
        String sRisultato;

        if (dPesoIdeale > dUserWeight)
        {
            sRisultato = "Utente sottopeso";
        }
        else if (dPesoIdeale < dUserWeight)
        {
            sRisultato = "Utente sovrappeso";
        }
        else
        {
            sRisultato = "Utente normopeso";
        }

        System.out.println(sRisultato);

    }

    public static void main(String[] args)
    {
        double dStaturaUtente;
        double dPesoUtente;

        System.out.print("Quanto alto sei (in cm)? ");
        dStaturaUtente = input.nextDouble();

        System.out.print("Quanto pesi (in kg)? ");
        dPesoUtente = input.nextDouble();
        
        VerificaPeso(dStaturaUtente, dPesoUtente);

    }
}