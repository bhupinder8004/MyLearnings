package bd.learnings.java;

public class MegaBytesConverter
{
    public static void printMegaBytesAndKiloBytes (int kiloBytes)
    {
        if (kiloBytes >= 0)
        {
            int mbValue = kiloBytes / 1024;
            int kbValue = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+mbValue+" MB and "+kbValue+" KB");
        } else
        {
            System.out.println("Invalid Value");
        }
    }
    public static void main (String [] args)
    {
        printMegaBytesAndKiloBytes(1024);
    }
}
