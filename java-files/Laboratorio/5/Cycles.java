import java.util.Scanner;

public class Cycles
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            System.out.print("Input the amount of numbers you want to print: ");
            int n = input.nextInt();
            printNumbers(n);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            input.close();
        }
    }

    public static void printNumbers(int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (i % 10 == 0) // implementato con laboratorio 5.1
            {
                System.out.println();
            }
            if (i < 10)
            {
                System.out.print("   " + i + 1 + " ")
            }
            if (i >= 10 < 99)
            {
                System.out.print(" " + i + 1 + " ")
            }
            else
            {
                System.out.print(i + 1 + " "); 
            }

            // System.out.print(i + 1 + " "); versione originale
        }
    }
}