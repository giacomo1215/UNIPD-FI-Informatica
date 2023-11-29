/*
CONSEGNA:
Scrivere il programma PrintTimeInterval.java che legga dall'input standard due orari nel formato "24 ore", ciascuno di quattro cifre (ad esempio, 0900 oppure 1730), con il secondo orario successivo al primo visualizzi sull'output standard il numero di ore e di minuti (separatamente) che intercorrono fra i due orari secondo il seguente esempio

Inserire il primo orario: 0900
Inserire il secondo orario: 1730
Tempo trascorso: 8 ore e 30 minuti
*/

import java.util.Scanner;

public class PrintTimeInterval
{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inserire il primo orario: ");
            int iTimeStart = in.nextInt();

            System.out.println("Inserire il secondo orario: ");
            int iTimeEnd = in.nextInt();

            int iTimeElapsed = timeElapsed(iTimeStart, iTimeEnd);

            System.out.println("Tempo trascorso: " + hoursElapsed(iTimeElapsed) + " ore e " + minutesElapsed(iTimeElapsed) + " minuti");
        }
        catch (Exception e)
        {
            System.out.println("Errore: " + e);
        }
        finally
        {
            in.close();
        }
    }

    public static int timeElapsed(int timeStart, int timeEnd)
    {
        int iTimeElapsed = timeEnd - timeStart;
        return iTimeElapsed;
    }

    public static int hoursElapsed(int timeElapsed)
    {
        int iHours = timeElapsed / 100;
        return iHours;
    }

    public static int minutesElapsed(int timeElapsed)
    {
        int iMinutes = timeElapsed % 100;
        return iMinutes;
    }

}