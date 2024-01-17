public class InverseStringLoop
{
    public static void main(String[] args)
    {
        String inputText = "uno due tre";
        System.out.println(reversedString(inputText));
    }

    public static String reversedString(String inputString)
    {
        int inputTextLength = inputString.length();
        StringBuilder sb = new StringBuilder();
        
        for (int i = inputTextLength - 1; i >= 0; i--)
        {
            char Character = inputString.charAt(i);
            sb.append(Character);
        }

        return sb.toString();
    }
}