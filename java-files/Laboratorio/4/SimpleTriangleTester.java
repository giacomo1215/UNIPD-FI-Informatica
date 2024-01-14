import java.util.Scanner;

public class SimpleTriangleTester
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            System.out.print("What's side A of your triangle? ");
            int a = in.nextInt();
            // System.out.println();
            System.out.print("What's side B of your triangle? ");
            int b = in.nextInt();
            // System.out.println();
            System.out.print("What's side C of your triangle? ");
            int c = in.nextInt();
            System.out.println();

            System.out.println(sOutput(a, b, c));
            
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            in.close();
        }
        
    }

    public static boolean IsTriangle(int a, int b, int c)
    {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static String sTriangleType(int a, int b, int c)
    {
        String TriangleType = "Not Valid";

        if(IsTriangle(a, b, c))
        {
            if(c > a && c > b && a + b == c)
            {
                TriangleType = "Scalene";
            }
            else if(a == b && a == c && b == c)
            {
                TriangleType = "Equilateral";
            }
            else if(b > a && c > a || b == c && (b > a + c || c > a + b))
            {
                TriangleType = "Isosceles";
            }
        }
        return TriangleType;
    }

    public static String sTriangleAngleType(int a, int b, int c)
    {
        String TriangleType = "Not Valid";

        if(IsTriangle(a, b, c))
        {
            if((c*c) - (a*a) - (b*b) > 0)
            {
                TriangleType = "Obtuse";
            }
            else if((c*c) - (a*a) - (b*b) < 0)
            {
                TriangleType = "Acute";
            }
            else if((c*c) - (a*a) - (b*b) == 0)
            {
                TriangleType = "Right";
            }
        }
        return TriangleType;
    }

    public static String sOutput(int a, int b, int c)
    {
        StringBuilder output = new StringBuilder();

        output.append("Triangle Type: ").append(sTriangleType(a, b, c)).append("\n");
        output.append("Triangle Angle: ").append(sTriangleAngleType(a, b, c)).append("\n");

        String finalOutput = output.toString();

        return finalOutput;
    }
}