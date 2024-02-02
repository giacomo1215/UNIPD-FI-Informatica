/*
Argomento: lettura di parametri da linea di comando, array, cicli
Realizzare una classe ComLine in cui si inseriscano dei parametri da linea di comando, ad esempio, in esecuzione: java ComLine 3 ciao 48
Se non vengono inseriti parametri riportare a standard output il messaggio: "Non sono stati inseriti parametri", altrimenti elencare, in ordine, uno sotto l'altro, i parametri inseriti.
*/
public class ComLine
{
    public static void main(String[] args)
    {
        if(CheckArgs(args))
        {
            PrintValues(args);
        }
        else
        {
            System.out.println("Non sono stati inseriti parametri");
        }
    }

    public static boolean CheckArgs(String[] a)
    {
        if (a.length == 0)
        {
            return false;
        }
        return true;
    }

    public static void PrintValues(String[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}