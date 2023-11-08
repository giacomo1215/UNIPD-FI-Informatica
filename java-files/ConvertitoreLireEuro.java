import java.util.Scanner;

public class ConvertitoreLireEuro {
    public static void main(String[] args) {
        
        double lire;
        double euro;
        
        Scanner t = new Scanner(System.in);
        System.out.print("Importo in lire = ");
        
        lire = t.nextDouble();
        euro = lire / 1936.27;
        euro = Math.round(euro);

        System.out.println(lire + " lire equivalgono a " + euro + " Euro");
    
    }
}
