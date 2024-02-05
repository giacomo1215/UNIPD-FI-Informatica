public class LightSwitch
{
    private boolean state;
    private static boolean lightBulb = false;

    public LightSwitch()
    {
        state = false;
    }

    public static boolean isLightOn()
    {
        return lightBulb;
    }

    public void changeStatus()
    {
        state = !state;
        lightBulb = !lightBulb;
    }

    public String getState()
    {
        String s = "";
        if(state)
        {
            s = "up";
        }
        else
        {
            s = "down";
        }

        return s;
    }
}