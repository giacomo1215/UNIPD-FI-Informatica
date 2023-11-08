// Scrivere un programma che:
// - definisca una variabile per memorizzare il valore del raggio di un cerchio e assegni alla variabile il valore 10.12;
// - definisca una costante per memorizzare il valore di π (pi greco) espresso con 15 cifre decimali (3.14159265358979)
// - memorizzi il valore della circonferenza in un'apposita variabile
// - invii a standard output il seguente messaggio:
//    "***La circonferenza di un cerchio di raggio ..... e' pari a ...***"
//    dove al posto dei caratteri ... ci siano i valori del raggio e della circonferenza, rispettivamente
// - memorizzi il valore dell'area in un'altra variabile
// - invii a standard output il seguente messaggio:
//    "***L'area di un cerchio di raggio ... e' pari a ...***"
//    dove al posto dei caratteri ... ci siano i valori del raggio e della circonferenza, rispettivamente

public class Circonferenza
{
    public static final double PI_CONSTANT = 3.14159265358979;
    public static void main (String[] args)
    {
        double raggio = 10.12;
        double circonferenza = 2 * PI_CONSTANT * raggio;

        System.out.println("La circonferenza di un cerchio di raggio " + raggio + " è pari a " + circonferenza);
    }
}