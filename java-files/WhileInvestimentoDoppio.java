/*
Esercizio in classe:
avendo depositato ventimila euro in un conto bancario che produce il 5% di interessi all'anno, capitalizzati annualmente, quanti anni occorrono affiché il saldo del conto arrivi al doppio della cifra iniziale?

Algoritmo:
- All'anno 0 il saldo è 20000
- While saldo < 20000
    - anno corrente + 1
    - saldo * 1.05
- saldo all'anno corrente è x
*/

public class WhileInvestimentoDoppio
{
    public static void main(String[] args)
    {
        final double D_SALDO_INIZIALE = 20000;
        final double D_TASSO_INTERESSI = 1.05;
        double dSaldo = D_SALDO_INIZIALE;
        int iAnno = 0;

        while (dSaldo < 2*D_SALDO_INIZIALE)
        {
            iAnno = iAnno + 1;
            dSaldo = dSaldo * D_TASSO_INTERESSI;
            System.out.println("Anno " + iAnno + ": " + dSaldo);
        }

        System.out.println("ci si mettono "+ iAnno + " anni per raggiungere " + dSaldo);

    }
}