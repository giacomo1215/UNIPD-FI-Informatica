import java.util.Scanner;
import java.util.InputMismatchException;

public class FactorGenerator
{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        try
        {
            vGenerate();
        }
        catch (Exception e)
        {
            System.out.println("Errore imprevisto... il programma verrà terminato.");
        }
        finally
        {
            in.close();
        }
    }

    public static int nextFactor(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (n % i == 0)
            {
                return i;
            }
        }
        return n;
    }

    public static void vDisplayFactors(int n)
    {
        System.out.println("I fattori primi di " + n + " sono: ");
        while (n > 1)
        {
            int f = nextFactor(n);
            System.out.println(f);
            n = n / f;
        }
    }

    public static int iGatherInput()
    {
        int input = 0;
        boolean validInput = false;

        while (!validInput)
        {
            try
            {
                System.out.print("Inserisci un numero intero positivo: ");
                input = in.nextInt();
                validInput = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Il valore inserito non è un numero intero... riprova.");
                in.nextLine();
            }
        }
        return input;
    }
    
    public static void vGenerate()
    {
        int n = iGatherInput();
        boolean done = false;

        do
        {
            try
            {
                if (n <= 0)
                {
                    throw new IllegalArgumentException("Il numero deve essere positivo... riprova.");
                }
                else if (n == 1)
                {
                    System.out.println("Il numero 1 non ha fattori primi.");
                    done = true;
                }
                else
                {
                    vDisplayFactors(n);
                    done = true;
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                n = iGatherInput();
            }
        }
        while (!done);
    }
}