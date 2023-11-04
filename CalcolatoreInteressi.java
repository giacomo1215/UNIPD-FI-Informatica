import java.util.Scanner;

public class CalcolatoreInteressi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // dichiaro variabili
        int a; 
        int imp;
        double tasso;
        
        // chiedo importo
        System.out.print("Quanti dineros? ");
        imp = input.nextInt();

        // chiedo tasso interesse
        System.out.print("Che tasso di interesse? ");
        tasso = input.nextDouble();
        
        // chiedo anni
        System.out.print("Quanti anni? ");
        a = input.nextInt();

        // eseguo il calcolo
        System.out.println("Risultato: " + Calcola(a, imp, tasso));
    }

    public static double Calcola(int a, int imp, double tasso)
    {
        double capf = imp * (1 + a * tasso);
        return capf;
    }
}