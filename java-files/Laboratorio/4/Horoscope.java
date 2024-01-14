import java.util.Scanner;
import java.util.Random;

public class Horoscope
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            System.out.println("When is your birthday? (DD/MM)");
            String Birthday = input.nextLine();
            GetHoroscope(Birthday);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            input.close();
        }
    }

    public static boolean isFormatValid(String BDay)
    {
        char targetChar = '/';
        return BDay.contains(String.valueOf(targetChar));
    }

    public static boolean isDateValid(int day, int month) 
    {
        if (month < 13)
        {
            if ((day < 1 || day > 31) || (month == 2 && (day < 1 || day > 29)))
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public static int generateRandomValue()
    {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public static String getHoroscopeSign(int day, int month)
    {
        String horoscopeSign;

        switch (month) 
        {
            case 1: // January
                horoscopeSign = (day <= 20) ? "Capricorn" : "Aquarius";
                break;
            case 2: // February
                horoscopeSign = (day <= 19) ? "Aquarius" : "Pisces";
                break;
            case 3: // March
                horoscopeSign = (day <= 20) ? "Pisces" : "Aries";
                break;
            case 4: // April
                horoscopeSign = (day <= 20) ? "Aries" : "Taurus";
                break;
            case 5: // May
                horoscopeSign = (day <= 21) ? "Taurus" : "Gemini";
                break;
            case 6: // June
                horoscopeSign = (day <= 21) ? "Gemini" : "Cancer";
                break;
            case 7: // July
                horoscopeSign = (day <= 22) ? "Cancer" : "Leo";
                break;
            case 8: // August
                horoscopeSign = (day <= 23) ? "Leo" : "Virgo";
                break;
            case 9: // September
                horoscopeSign = (day <= 23) ? "Virgo" : "Libra";
                break;
            case 10: // October
                horoscopeSign = (day <= 23) ? "Libra" : "Scorpio";
                break;
            case 11: // November
                horoscopeSign = (day <= 22) ? "Scorpio" : "Sagittarius";
                break;
            case 12: // December
                horoscopeSign = (day <= 21) ? "Sagittarius" : "Capricorn";
                break;
            default:
                horoscopeSign = "Invalid month";
                break;
        }
        return horoscopeSign;
    }

    public static void GetHoroscope(String BDay)
    {
        if(isFormatValid(BDay))
        {
            // I gather birthday and split it into two separate integers
            String[] Birthday = BDay.split("/");
            int day = Integer.parseInt(Birthday[0]);
            int month = Integer.parseInt(Birthday[1]);

            if(isDateValid(day, month))
            {
                System.out.println();
                System.out.println(getHoroscopeSign(day, month));
                System.out.println("------------------");
                System.out.println("Love: " + generateRandomValue() + "/5");
                System.out.println("Friendship: " + generateRandomValue() + "/5");
                System.out.println("Work: " + generateRandomValue() + "/5");
            }
            else
            {
                System.out.println("Date invalid");
            }
        }
        else
        {
            System.out.println("Bing bong dumb fuck, forgot your damn /");
        }
    }
}