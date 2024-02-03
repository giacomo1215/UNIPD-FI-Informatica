import java.util.Scanner;

public class PlayTris
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Tris trisBoard = new Tris();
        
        TrisPlayer player1 = new TrisPlayer("Player 1", 'X');
        TrisPlayer player2 = new TrisPlayer("Player 2", 'O');

        TrisPlayer currentPlayer = player1;

        while(!trisBoard.isGameOver())
        {
            displayBoard(trisBoard);
            
            promptPlayerMove(currentPlayer);
            int row = input.nextInt();
            int column = input.nextInt();

            // Make the move
            if(trisBoard.setCharInPosition(row, column, currentPlayer.getSymbol()))
            {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
            else
            {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    private static void displayBoard(Tris trisBoard)
    {
        System.out.println(trisBoard.toString());
    }

    private static void promptPlayerMove(TrisPlayer currentPlayer)
    {
        System.out.println(currentPlayer.getName() + ", it's your turn now.");
        System.out.println("Insert your move (row and column)");
    }
}