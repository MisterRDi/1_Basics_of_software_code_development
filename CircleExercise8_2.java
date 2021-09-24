import java.sql.Array;
import java.util.Arrays;

public class CircleExercise8_2
{
    public static void main(String[] args)
    {

        int firstNumber = 47653856;
        int secondNumber = 1374807495;

        int [] twoNumbers2 = {firstNumber, secondNumber};

        for (int num : twoNumbers2)
        {

            int lengthNumber = (int) (Math.log10(num) + 1); // Определяем кол-во символов в числе
            int maxDivider = (int) Math.pow(10, lengthNumber - 1);

            System.out.println("\n" + "Число: " + num);
            System.out.print("Цифры числа: ");

            int[] arrayOfDigits = new int[lengthNumber]; // Сщздаем архив цифр числа

            int indexOfArray = 0; // Задаем начальное значение индекса позиции в архиве

            for (int divider = maxDivider; 1 <= divider; divider /= 10)
            {

                int digitOfNumber = (int) num / divider;

                arrayOfDigits [indexOfArray] = digitOfNumber;

                indexOfArray++;

                num = num % divider;

            }

            // System.out.println("\n");
            System.out.println(Arrays.toString(arrayOfDigits));
        }
    }
}
