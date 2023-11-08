import java.util.Scanner;

public class ControlloTriangoloRettangolo
{
    public static void main(String[] args)
    {
        // Creo gli input
        Scanner input = new Scanner(System.in);
        double A;
        double B;
        double C;
        
        // Prendo tutti i valori dall'utente
        System.out.print("Primo lato: ");
        A = input.nextDouble();
        System.out.print("Secondo lato: ");
        B = input.nextDouble();
        System.out.print("Terzo lato: ");
        C = input.nextDouble();

        // Controllo se triangolo e' rettangolo o no
        if (A*A==B*B+C*C || B*B==A*A+C*C || C*C==A*A+B*B)
        {
            System.out.println("Il triangolo è rettangolo");
        }
        else
        {
            System.out.println("Il triangolo non è rettangolo");
        }
    }
}