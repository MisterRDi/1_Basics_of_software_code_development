public class CircleExercise3
{
    public static void main (String[] args)
    {
        // 3. Найти сумму квадратов первых ста чисел.

        int result = 0;

        for (int x = 1; x <= 100; x++)
        {
            // int xSquared = (int) Math.pow(x, 2);
            int xSquared = x * x;
            result += xSquared;
        }

        System.out.println("Сумма квадратов чисел от 1 до 100: " + result);
    }
}
