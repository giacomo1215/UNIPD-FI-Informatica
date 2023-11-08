import java.util.Scanner;

public class PunteggioGiocatori
{
    // initializing scanner
    static Scanner input = new Scanner(System.in);
    
    // initializing player scores
    public static int iScoreA;
    public static int iScoreB;

    public static void main(String[] args)
    {
        System.out.println("What did player A score? ");
        iScoreA = input.nextInt();
        
        System.out.println("What did player B score? ");
        iScoreB = input.nextInt();

        vCheckScore(iScoreA, iScoreB);
    }

    public static void vCheckScore(int A, int B)
    {
        if (A > B)
        {
            System.out.println("Player A won");
        }
        else
        {
            System.out.println("Player B won");
        }
    }
}