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
        System.out.println();
        System.out.println("-------------");
        
        // Printing the array
        printArray(array);
        
        System.out.println();
        System.out.println("-------------");

        // User selects the sorting algorithm between selection / bubble / insertion sort
        System.out.println("Select the sorting algorithm: ");
        System.out.println("1. Selection sort (ASCENDING)");
        System.out.println("2. Selection sort (DESCENDING)");
        System.out.println("3. Merge sort");
        System.out.println("4. Insertion sort (not implemented)");

        int choice = input.nextInt();
        System.out.println("-------------");
        long startTime = System.currentTimeMillis();
        switch (choice)
        {
            case 1: // Selection sort (ascending)
                selectionSortAsc(array);
                break;

            case 2: // Selection sort (descending)
                selectionSortDesc(array);
                break;

            case 3: // Merge sort
                mergeSort(array);
                break;

            //case 4:
            //    insertionSort(array);
            //    break;
            
            default:
                System.out.println("Invalid choice");
                break;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Operation completed in " + (endTime - startTime) + " milliseconds");
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

    public static void mergeSort(int[] originalArray)
    {
        if (originalArray == null)
        {
            return;
        }
        if (originalArray.length < 2) 
        {
            return; // Base case: stop recursion
        }

        int mid = originalArray.length / 2;
        int[] left = new int[mid];
        int[] right = new int[originalArray.length - mid];

        System.arraycopy(originalArray, 0, left, 0, left.length);
        System.arraycopy(originalArray, mid, right, 0, right.length);

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // Merging the two arrays
        merge(left, right, originalArray);

        // Printing the array
        printArray(originalArray);
        System.out.println();
    }

    public static void merge(int[] left, int[] right, int[] originalArray)
    {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length)
        {
            if (left[leftIndex] < right[rightIndex]) {
                originalArray[originalIndex++] = left[leftIndex++];
            } else {
                originalArray[originalIndex++] = right[rightIndex++];
            }
        }

        // Copy remaining elements from left array, if any
        while (leftIndex < left.length)
        {
            originalArray[originalIndex++] = left[leftIndex++];
        }

        // Copy remaining elements from right array, if any
        while (rightIndex < right.length)
        {
            originalArray[originalIndex++] = right[rightIndex++];
        }
    }

    // Ascending selection sort (Integers only)
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

    // Printing the array
    public static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}