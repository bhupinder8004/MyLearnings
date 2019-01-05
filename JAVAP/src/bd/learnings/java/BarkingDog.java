package bd.learnings.java;

public class BarkingDog
{
    public static boolean bark (boolean barking, int hourOfDay)
    {
        if ((barking == true) && ((hourOfDay < 8 && hourOfDay>=0) || (hourOfDay > 22 && hourOfDay <=23)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main (String args [])
    {
        boolean funcValue = bark (true,-2);
        System.out.println(funcValue);
    }
}
