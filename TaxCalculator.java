import java.util.Scanner;

public class TaxCalculator 
{

    // create a scanner for all methods
    static Scanner input = new Scanner(System.in);

    // instance variables
    public static int status;
    public static double income;
    public static String sStatus;

    // constants
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    public static final double RATE1 = 0.10;
    public static final double RATE2 = 0.25;

    public static final double SINGLE_LIMIT = 32000;
    public static final double MARRIED_LIMIT = 64000;

    public static void main(String[] args) 
    {
        try 
        {
            vTaxCalculatorStart();
            double tax = getTax();
            System.out.println("Calculated tax: " + tax);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        } 
        finally 
        {
            input.close();
        }
    }

    public static void vTaxCalculatorStart() 
    {
        System.out.println("-----------------------------");
        System.out.println("Welcome to the Tax Calculator");
        System.out.println("-----------------------------");

        // ask user for marital status
        System.out.print("Marital Status? (single / married): ");
        sStatus = input.nextLine();
        sStatus = sStatus.toUpperCase();

        // ask for income
        System.out.print("Annual income? ");
        income = input.nextDouble();

        // clear the buffer
        input.nextLine();
    }

    public static double getTax() 
    {
        double tax1 = 0;
        double tax2 = 0;

        if (sStatus.equals("SINGLE")) 
        {
            status = SINGLE;
            if (income <= SINGLE_LIMIT) 
            {
                tax1 = RATE1 * income;
            } 
            else 
            {
                tax1 = RATE1 * SINGLE_LIMIT;
                tax2 = RATE2 * (income - SINGLE_LIMIT);
            }
        } 
        else if (sStatus.equals("MARRIED")) 
        {
            status = MARRIED;
            if (income <= MARRIED_LIMIT) 
            {
                tax1 = RATE1 * income;
            } 
            else 
            {
                tax1 = RATE1 * MARRIED_LIMIT;
                tax2 = RATE2 * (income - MARRIED_LIMIT);
            }
        } 
        else 
        {
            throw new IllegalArgumentException("Invalid marital status provided.");
        }

        return tax1 + tax2;
    }
}
