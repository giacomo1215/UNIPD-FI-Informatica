// import java.util.Scanner;

public class BankAccount
{
    private double balance;
    
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public double getBalance()
    {
        return balance;
    }
    
    public BankAccount()
    {
        balance = 0;
    }

    public static void main (String[] args)
    {
        final double RATE = 5;

        BankAccount account = new BankAccount(500);
        System.out.println(account.getBalance());
        
        account.withdraw(20);
        System.out.println(account.getBalance());
        
        account.deposit(200);
        System.out.println(account.getBalance());
        
        // calcolo interessi dopo il primo anno
        double interest = account.getBalance() * RATE / 100;

        // sommo interessi del primo anno
        account.deposit(interest);
        System.out.println("Dopo il primo anno il saldo ammonta a " + account.getBalance());
    }
}