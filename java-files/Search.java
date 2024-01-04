import java.util.Scanner;

public class Search
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            System.out.print("Enter the size of the array: ");
            int size = input.nextInt();
            int[] array = createArray(size);
            System.out.println();
            System.out.println("Your new array:");
            printArray(array);
            System.out.println();

            System.out.print("Enter the value to search: ");
            int value = input.nextInt();
            int index = sequentialSearch(array, value);
            if (index == -1)
            {
                System.out.println("Value not found");
            }
            else
            {
                System.out.println("Value found at index " + index);
            }

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

    public static int sequentialSearch(int[]a, int v)
    {
        if (a == null)
        {
            return -1;
        }

        for (int i=0; i < a.length; i++)
        {
            if (a[i] == v)
            {
                return i;
            }
        }
        return -1;
    }

    public static int[] createArray(int size)
    {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

}