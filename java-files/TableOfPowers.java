import java.util.Scanner;

public class TableOfPowers
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Calcolo dei valori di x alla y...");

            System.out.print("Valore massimo di x: ");
            int maxX = input.nextInt();

            System.out.print("Valore massimo di y: ");
            int maxY = input.nextInt();

            int maxValue = (int)Math.round(Math.pow(maxX, maxY));

            int columnWidth = 1 + Integer.toString(maxValue).length();

            int[][] powers = makeAndFillPowers(maxX, maxY);
            display(powers, columnWidth);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            input.close();
        }
    }

    public static int[][] makeAndFillPowers(int x, int y)
    {
        int[][] mat = new int[x][y];
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                mat[i][j] = (int)Math.round(Math.pow(i+1, j+1));
            }
        }

        return mat;
    }

    public static void display(int[][] mm, int width)
    {
        for (int i = 0; i < mm.length; i++)
        {
            for (int j = 0; j < mm[0].length; j++)
            {
                String s = Integer.toString(mm[i][j]);
                while (s.length() < width)
                {
                    s = " " + s;
                }
                System.out.print(s);
            }
            System.out.println();
        }
    }
}