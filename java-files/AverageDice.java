public class AverageDice
{
    public static void main(String[] args)
    {
        final int LINES_TO_TRY = 10;
        for (int i = 0; i < LINES_TO_TRY; i++)
        {
            System.out.println("Average " + (i + 1) + ": " + avg());
        }
    }

    public static double avg()
    {
        double sum = 0;
        final int TRIALS = 100000;

        for (int i = 0; i < TRIALS; i++)
        {
            // nuovo lancio del dado
            int d = (int)(1 + 6 * Math.random());
            sum = sum + d;
        }
        return sum / TRIALS;
    }
}