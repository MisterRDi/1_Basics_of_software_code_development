public class Exercise1
{
    public static void main (String[] args)
    {
        // z = ( (a – 3 ) * b / 2) + c
        int a = 1;
        double b = 3.0;
        int c = 4;

        final int d = 3;
        final double e = 2.0;

        double b1 = b / e; // division
        int aMinus = a - d; // subtraction

        var expression = aMinus * b1 + c;

        System.out.println(expression);
    }
}