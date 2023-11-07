/*
Obiettivo: scrivere classi di collaudo di una classe data
Scrivere un programma di collaudo Bonifico.java per la classe BankAccount (di cui dovreste gia' disporre del bytecode, altrimenti lo trovate nella sezione File utili e soluzioni di Attivita' di Laboratorio di questo corso moodle) in cui: Creare due conti bancari (account1 e account2). Depositare in account1 1000 euro. Depositare in account2 100 euro. Stampare a video il valore del saldo di ciascun conto. Prelevare da account1 400 euro e depositare la stessa quantita' in account2. Stampare a video il valore del saldo di ciascun conto. Abbiamo simulato un bonifico dal primo conto al secondo! 

NB: per poter eserguire il tester il file BankAccount.class deve trovarsi nella cartella/directory dove c'e' Bonifico.java

La classe BankAccount e' una classe gia' compilata in bytecode (cioe' voi non potete vedere il sorgente, pensate che sia una scatola nera), con i seguenti metodi:
Costruttore:
    BankAccount()
    Metodi pubblici non statici:

        void deposit(double)
        double getBalance()
        void withdraw(double)
La classe e' stata illustrata nelle slide FdI2324-set4, slide 73 e seguenti. Lo scopo di questo esercizio e' utilizzare una classe creata da altre persone senza il sorgente e ricompilare il codice, quindi non dovete creare un file BankAccount.java con il sorgente e poi compilarlo.

Quindi non dovete eseguire il comando javac BankAccount.java per ottenere il file BankAccount.class, ma usare quello fornito in questa pagina!
*/

public class Bonifico
{
    public static void main(String[] args)
    {
        // creo i conti bancari
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Conto 1 ha " + account1.getBalance() + " € in conto.");
        System.out.println("Conto 2 ha " + account2.getBalance() + " € in conto.");
        
        // deposito 1000 in conto 1
        account1.deposit(1000);
        System.out.println("Conto 1 ha " + account1.getBalance() + " € in conto.");
        
        // deposito 100 in conto 2
        account2.deposit(100);
        System.out.println("Conto 2 ha " + account2.getBalance() + " € in conto.");

        // ritiro 400 euro da conto 1 e aggiungo a conto 2
        account1.withdraw(400);
        account2.deposit(400);
        System.out.println("Conto 1 ha " + account1.getBalance() + " € in conto.");
        System.out.println("Conto 2 ha " + account2.getBalance() + " € in conto.");

    }
}