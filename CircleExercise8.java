public class CircleExercise8
{
    public static void main(String[] args)
    {

        int firstNumber = 47653856;
        int secondNumber = 1374807495;

        int [] twoNumbers = {firstNumber, secondNumber};

        for (int num : twoNumbers)
        {

            int lengthNumber = (int) (Math.log10(num) + 1); // Определяем кол-во символов в числе
            int maxDivider = (int) Math.pow(10, lengthNumber - 1);

            System.out.println("\n" + "Число: " + num);
            System.out.print("Цифры числа: ");

            for (int divider = maxDivider; 1 <= divider; divider /= 10)
            {

                int digitOfNumber = (int) num / divider;

                System.out.print(digitOfNumber + "  ");

                num = num % divider;

            }

            System.out.println();

        }
    }
}
