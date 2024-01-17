public class DNA
{
    public static void main(String[] args)
    {
        String inputDNA = "ACCTGGTAC";
        System.out.println("Input: " + inputDNA);
        System.out.println("Output: " + outputDNA(inputDNA));
    }

    public static String outputDNA(String inputDNA)
    {
        StringBuilder result = new StringBuilder();

        for(int i = inputDNA.length() - 1; i >= 0; i--)
        {
            char inputChar = inputDNA.charAt(i);
            char calculatedChar = calculateChar(inputChar);
            result.append(calculatedChar);
        }

        return result.toString();
    }

    public static char calculateChar(char inputChar)
    {
        switch (inputChar)
        {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                // Questo caso non dovrebbe mai verificarsi a causa della validazione iniziale
                throw new IllegalArgumentException("Carattere non valido: " + inputChar);
        }
    }
}