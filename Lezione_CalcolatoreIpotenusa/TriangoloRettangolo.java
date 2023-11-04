// importo classe scanner con il quale posso costruire una tastiera virtuale
import java.util.Scanner;
// importo classi di matematica perché devo fare delle radici
// import java.math.*;

// creo nuova classe chiamata come il file
public class TriangoloRettangolo 
{
    public static void main(String[] args)
    {
        // Creo un nuovo scanner
        Scanner input = new Scanner(System.in);
        
        // dichiaro variabili
        double Cat1;
        double Cat2;
        double Ipo;

        // stampo questo messaggio
        System.out.print("Primo cateto = ");
        
        // imposto variabile in base a valore dato dall'utente
        Cat1 = input.nextDouble();

        // stampo questo messaggio
        System.out.print("Secondo cateto = ");
        
        // imposto variabile in base a valore dato dall'utente
        Cat2 = input.nextDouble();

        if(Cat1 >= 0 && Cat2>= 0)
        {
            Ipo = Math.sqrt(Cat1 * Cat1 + Cat2 * Cat2);
            System.out.println("Ipotenusa = " + Ipo);
        } 
        else 
        {
            System.out.println("ERRORE:");
            System.out.println("Inserisci valori positivi");
        }
    }
}