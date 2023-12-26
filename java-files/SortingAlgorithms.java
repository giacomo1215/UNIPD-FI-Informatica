import java.util.Scanner;

public class SortingAlgorithms
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        
        // Creating the array
        int[] array = createArray(size);

        // Printing the array
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // User selects the sorting algorithm between selection / bubble / insertion sort
        System.out.println("Select the sorting algorithm: ");
        System.out.println("1. Selection sort (ASCENDING)");
        System.out.println("2. Selection sort (DESCENDING)");
        System.out.println("3. Bubble sort (not implemented)");
        System.out.println("4. Insertion sort (not implemented)");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1: // Selection sort
                // Creating milliseconds counter 
                long startTime = System.currentTimeMillis();
                selectionSortAsc(array);
                long endTime = System.currentTimeMillis();
                System.out.println("Array sorted in " + (endTime - startTime) + " milliseconds");
                break;
            case 2: // Selection sort (descending)
                // Creating milliseconds counter 
                startTime = System.currentTimeMillis();
                selectionSortDesc(array);
                endTime = System.currentTimeMillis();
                System.out.println("Array sorted in " + (endTime - startTime) + " milliseconds");
                break;
            //case 3:
            //    bubbleSort(array);
            //    break;
            //case 4:
            //    insertionSort(array);
            //    break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    
    // Creating array
    public static int[] createArray(int size)
    {
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
        
        return array;
    }

    // Ascending selection sort
    public static void selectionSortAsc (int[] a)
    {
        String output = "";
        if (a == null)
        {
            return;
        }
        
        // Searching for the minimum value in the array
        for (int i = 0; i < a.length - 1; i++)
        {
            int minPos = findMinPosFrom(a, i);
            swap(a, minPos, i);

            // Printing the array
            for (int j = 0; j < a.length; j++)
            {
                output = output + a[j] + " ";
            }
            output = output + "\n";
        }

        System.out.println(output);
    }

    // Descending selection sort
    public static void selectionSortDesc (int[] a)
    {
        String output = "";
        if (a == null)
        {
            return;
        }

        // Searching for the maximum value in the array
        for (int i = 0; i < a.length - 1; i++)
        {
            int maxPos = findMaxPosFrom(a, i);
            swap(a, maxPos, i);

            // Printing the array
            for (int j = 0; j < a.length; j++)
            {
                output = output + a[j] + " ";
            }
            output = output + "\n";
        }

        System.out.println(output);
    }

    private static void swap(int[] a, int i, int j)
    {
        // Swapping the values of the array at position i and j using a temporary variable
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int findMinPosFrom(int[] a, int from)
    {
        // Searching for the minimum value in the array starting from the position "from"
        int pos = from;

        for (int i = from + 1; i < a.length; i++)
        {
            // If the value at position i is less than the value at position pos, then pos is updated
            if (a[i] < a[pos])
            {
                pos = i;
            }
        }

        // Returning the position of the minimum value
        return pos;
    }

    public static int findMaxPosFrom(int[] a, int from)
    {
        // Searching for the maximum value in the array starting from the position "from"
        int pos = from;

        for (int i = from + 1; i < a.length; i++)
        {
            // If the value at position i is greater than the value at position pos, then pos is updated
            if (a[i] > a[pos])
            {
                pos = i;
            }
        }

        // Returning the position of the maximum value
        return pos;
    }
}