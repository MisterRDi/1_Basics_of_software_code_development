public class Exercise4
{
    public static void main (String[] args)
    {
        double r = 234.789;
        double rInt = (int) r;
        double result = r * 1000 % 1000 + rInt / 1000;

        System.out.println(result);
    }
}
