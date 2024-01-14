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
            if (i % 10 == 0) // implementato con esercizi del laboratorio 5
            {
                System.out.println();
            }
            System.out.print(i + 1 + " ");
        }
    }
}