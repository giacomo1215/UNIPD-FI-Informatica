/*
Esercizio di prova di loop annidati, calcolando le potenze x^y
*/
public class PotenzeLoop
{
    final static int I_COL_WIDTH = 5;
    public static void main(String[] args)
    {
        try
        {
            for (int x = 1; x <= 4; x++) // per ogni x tra 1 e 4 ( incluso )
            {
                for (int y = 1; y <= 5; y++) // per ogni y tra 1 e 5 ( incluso )
                {
                    String p = "" + (int)Math.pow(x,y);   
                    
                    while(p.length() < I_COL_WIDTH)
                    {
                        p = " " + p;
                    }

                    System.out.print(p);
                }
                System.out.print("\n");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}