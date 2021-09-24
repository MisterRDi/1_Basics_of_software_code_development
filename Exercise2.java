public class Exercise2
{
    public static void main (String[] args)
    {
        // (𝑏 + √(𝑏(2) + 4𝑎𝑐))/2𝑎 − 𝑎(3) * 𝑐 + b(−2)
        // (Exponents are in the brackets)

        double b = 1;
        final double expB = 2; // (b) power
        double bSquared = Math.pow(b, expB);

        double a = 1;
        double c = 2;

        final double four = 4;
        double multi4AC = four * a * c;

        double sqrtSubDividend = Math.sqrt(bSquared + multi4AC);
        double dividend = b + sqrtSubDividend; // dividend

        final double two = 2;
        double multi2A = two * a; // divider

        double division = dividend / multi2A; // division

        final double expA = 3; // (a) power
        double aPow3 = Math.pow(a, expA);
        double multiAPow3C = aPow3 * c;

        final double expB2 = -2; // (b) power
        double bPowMinus2 = Math.pow(b, expB2);

        double expression = division - multiAPow3C +bPowMinus2; // Version 1

        double expressionSecEd = (b + sqrtSubDividend) / multi2A - multiAPow3C +bPowMinus2; // Version 2

        System.out.println(expression);
        System.out.println(expressionSecEd);


    }
}
