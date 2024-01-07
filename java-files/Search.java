import java.util.Scanner;

public class Search
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        
        int searchValue;
        int arraySize;
        String choice;
        int[] array = null;
        int index;

        try
        {
            System.out.print("Do you want your array to be ordered? (y/n): ");
            choice = input.nextLine();
            choice = choice.toUpperCase();

            System.out.println();
            System.out.println("Enter the size of the array: ");
            arraySize = input.nextInt();

            switch (choice)
            {
                case "Y":
                    array = createRandomOrderedArray(arraySize);
                    printArray(array);
                    System.out.println();
                    break;

                case "N":
                    array = createArray(arraySize);
                    printArray(array);
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

            if (choice.equals("Y"))
            {
                System.out.println("What do you want to search?");
                searchValue = input.nextInt();
                long startTime = System.currentTimeMillis();
                index = binarySearch(array, searchValue);
                long endTime = System.currentTimeMillis();
                printResult(index);
                System.out.println();
                System.out.println("Operation completed in " + (endTime - startTime) + " milliseconds");
            }
            else if (choice.equals("N"))
            {
                System.out.println("What do you want to search?");
                searchValue = input.nextInt();
                long startTime = System.currentTimeMillis();
                index = sequentialSearch(array, searchValue);
                long endTime = System.currentTimeMillis();
                printResult(index);
                System.out.println();
                System.out.println("Operation completed in " + (endTime - startTime) + " milliseconds");
            }

            System.out.println();
            // System.out.println("Operation completed in " + (endTime - startTime) + " milliseconds");
            
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

    public static int binarySearch(int[]a, int v)
    {
        if (a == null)
        {
            return -1;
        }
        
        int from    = 0;
        int to      = a.length;

        while (from < to)
        {
            int middle = (from + to) / 2;
            if (a[middle] == v)
            {
                return middle;
            }
            else if (a[middle] < v)
            {
                from = middle + 1;
            }
            else
            {
                to = middle;
            }
        }
        return -1;
    }

    public static int[] createArray(int size)
    {
        int[] usedValues = new int[size + 1];
        int[] array = new int[size];
        int tempValue;

        for (int i = 0; i < size; i++)
        {
            boolean isUsed = false;
            tempValue = (int)(Math.random() * 100);
            
            // Checking if the value has already been used
            for (int j = 0; j < i; j++)
            {
                if (tempValue == usedValues[j])
                {
                    isUsed = true;
                    break; // Exiting loop once value is found
                }
            }

            // Inserting it in the array
            if (!isUsed)
            {
                array[i] = tempValue;
                usedValues[i] = tempValue;
            }
            else
            {
                i--;
            }
        }
        return array;
    }

    // Create an ordered array with random values
    public static int[] createRandomOrderedArray(int size)
    {
        // Initializing array
        int[] array = new int[size];
        
        // Filling array from the first spot with a random number
        array[0] = (int)(Math.random() * 100);
        
        // Filling the rest of the array basing on the previous value
        for (int i = 1; i < size; i++)
        {
            array[i] = array[i-1] + (int)(Math.random() * 100);
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

    public static void printResult(int index)
    {
        if (index == -1)
        {
            System.out.println("Value not found");
        }
        else
        {
            System.out.println("Value found at index " + index);
        }
    }

}