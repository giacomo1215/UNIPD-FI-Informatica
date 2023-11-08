// Scrivere un programma ProvaVariabili che:
// - Definisca una variabile intera larghezza e la inizializzi a 20;
// - Definisca una variabile intera lunghezza e la inizializzi a 30;
// - Modifichi il valore di largezza attribuendogli il valore 40;
// - Modifichi il valore di lunghezza aggiungendo 15 al suo attuale valore
// - Stampi in output il messaggio "L'area del tavolo e' "
// - Stampi in output il prodotto dei valori delle variabili larghezza e lunghezza

public class ProvaVariabili
{
    public static void main (String[] args)
    {
        int larghezza = 20;
        int lunghezza = 30;

        int area = larghezza * lunghezza;
        
        System.out.println("\nL'area di un rettangolo di larghezza " + larghezza + "m e lunghezza " + lunghezza + "m è di " + area + "m^2. \n \n");

        System.out.println("--------------------");
        System.out.println("Cambio i parametri..");
        System.out.println("--------------------\n");

        larghezza = 40;
        System.out.println("Ho settato larghezza a 40\n");

        lunghezza += 15;
        area = larghezza * lunghezza;

        System.out.println("\nHo aggiunto 15 alla lunghezza risultando " + lunghezza + "\n" + "La nuova area equivale a " + area + "\n");



    }
}