public class Tris
{
    public static final int GRID_SIZE = 3;
    char[][] grid;

    public Tris()
    {
        grid = new char[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++)
        {
            for(int j = 0; j < GRID_SIZE; j++)
            {
                grid[i][j] = '.';
            }
        }
    }

    public String toString()
    {
        String s = "";
        
        for(int i = 0; i < GRID_SIZE; i++)
        {
            for(int j = 0; j < GRID_SIZE; j++)
            {
                s += grid[i][j] + " ";
            }
            s += "\n";
        }

        return s;
    }

    public boolean setCharInPosition(int row, int column, char c)
    {
        if (row < 0 || row > 2 || column < 0 || column > 2)
        {
            throw new IllegalArgumentException();
        }

        if(grid[row][column] != '.')
        {
            return false;
        }
        else
        {
            grid[row][column] = c;
            return true;
        }
    }

    public boolean isWinning(char c)
    {
        int count;

        // Check by row
        for (int i = 0; i < GRID_SIZE; i++)
        {
            count = 0;
            for (int j = 0; j < GRID_SIZE; j++)
            {
                if(grid[i][j] == c)
                {
                    count++;
                }
            }
            if (count == 3)
            {
                return true;
            }
        }

        // Check by column
        for (int i = 0; i < GRID_SIZE; i++)
        {
            count = 0;
            for (int j = 0; j < GRID_SIZE; j++)
            {
                if(grid[j][i] == c)
                {
                    count++;
                }
            }
            if (count == 3)
            {
                return true;
            }
        }

        if((grid[0][0] == c && grid[1][1] == c && grid[2][2] == c) || (grid[0][2] == c && grid[1][1] == c && grid[2][0] == c))
        {
            return true;
        }

        return false;
    }

    public boolean isGameOver()
    {
        return isWinning('X') || isWinning('O') || isBoardFull();
    }

    public boolean isBoardFull()
    {
        for (int i = 0; i < GRID_SIZE; i++)
        {
            for (int j = 0; j < GRID_SIZE; j++)
            {
                if(grid[i][j] == '.') return false;
            }
        }

        return true;
    }
}