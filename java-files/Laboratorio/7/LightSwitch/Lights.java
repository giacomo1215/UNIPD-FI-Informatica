import java.util.Scanner;

public class Lights
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("How many switches do you want to create?");
        int n = input.nextInt();

        LightSwitch[] switches = new LightSwitch[n];

        for (int i = 0; i < n; i++) 
        {
            switches[i] = new LightSwitch();
        }

        System.out.println("What switch do you want to hit?");

        while(input.hasNext()) 
        {
            String inputString = input.next();
            if (inputString.equalsIgnoreCase("exit"))
            {
                System.out.println("Bye bye :)");
                break;
            }
            try
            {
                int switchIndex = input.nextInt();
                hitLight(switches, switchIndex);
                for (LightSwitch lightSwitch : switches) 
                {
                    System.out.println(lightSwitch.getState());
                }
            }
            catch (NumberFormatException e)
            {
                System.err.println("Not a valid input.");
            }
        }
    }

    public static void hitLight(LightSwitch[] switches, int n) 
    {
        if (n >= 1 && n <= switches.length) 
        {
            switches[n - 1].changeStatus();
        } 
        else 
        {
            System.out.println("Invalid switch index");
        }
    }
}