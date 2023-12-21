import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        in.close();
    }

    public static int factorial(int n)
    {
        try
        {
            if (n < 0)
            {
                throw new IllegalArgumentException("n must be >= 0");
            }
            else if (n == 0)
            {
                return 1;
            }
            
            return n * factorial(n-1);
        }
        catch (StackOverflowError e)
        {
            System.out.println("Stack overflow!");
            return 0;
        }
    }
}