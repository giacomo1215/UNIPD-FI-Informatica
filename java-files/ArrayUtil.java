public class ArrayUtil
{
    // metodo per ridimensionare array
    public static double[] resize(double[] oldArray, int newLength)
    {
        if (newLength < oldArray.length)
        {
            // gestire la situazione come più opportuno
        }
        
        double[] newArray = new double[newLength];
        for (int i = 0; i < oldArray.length; i++)
        {
            newArray[i] = oldArray[i];
        }

        return newArray;
    } 

    public static int[] randomIntArray(int length, int n)  
    {  
        int[] a = new int[length];  
        for (int i = 0; i < a.length; i++)  
        {
            a[i] = (int) (n * Math.random());  
        }
        return a;  
    }  

    public static String printArray(int[] v, int vSize)
    {
        String s = "[";
        for (int i = 0; i < vSize; i++)
        {
            s = s + v[i] + " ";
        }
        s = s + "]";
        return s;
    }
}