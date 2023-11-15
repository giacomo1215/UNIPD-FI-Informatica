// problema esercizio in classe 15 novembre 2023
import java.util.Scanner;

public class SelectValue
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        double[] values = new double[10];
        System.out.println("Inserisci dieci valori");
        for (int i  = 0; i < values.length; i++)
        {
            values[i] = input.nextDouble();
        }
        
        System.out.println("Inserisci un numero:");
        int index = input.nextInt();

        if (index < 0 || index >= values.length)
        {
            System.out.println("Valore errato");
        }
        else
        {
            System.out.println(values[index]);
        }
        input.close();
    }
}