import java.math.BigInteger;

public class CircleExercise4
{
    public static void main (String[] args)
    {
        // 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

        BigInteger result = BigInteger.valueOf(1);

        for (int x = 1; x <= 200; x++)
        {
            BigInteger xSquared = BigInteger.valueOf(x * x);
            result = result.multiply(xSquared);
        }

        System.out.println("Произведение квадратов чисел от 1 до 200: " + result);
    }
}
