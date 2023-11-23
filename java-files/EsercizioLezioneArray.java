import java.util.Scanner;

public class EsercizioLezioneArray
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        try
        {
            double[] values = new double[1000];
            int valuesSize = 0;

            while (true)
            {
                String s = input.nextLine();

                // se riga vuota, interrompo il ciclo
                if (s.equals(""))
                {
                    break;
                }

                values[valuesSize] = Double.parseDouble(s);
                valuesSize++;
            }

            if (index <  0 || index >= valuesSize)
            {
                System.out.println("Valore errato");
            }
            else 
            {
                System.out.println(values[index]);
            }

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
}