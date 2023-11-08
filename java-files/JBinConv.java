// import
import java.util.Scanner;

// converter
public class JBinConv
{
    public static String ConvertBinary(int inputUserValue)
    {
        String sBinary = "";
        while(inputUserValue > 0)
        {
            int remainder = inputUserValue % 2;
            sBinary = remainder + sBinary;
            
            inputUserValue = inputUserValue / 2;
        }
        return sBinary;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int UsrValue = 0;

        System.out.print("Inserisci un numero che vuoi convertire in binario: ");
        UsrValue = input.nextInt();

        System.out.println("Rappresentazione binaria: " + ConvertBinary(UsrValue));
    }
}