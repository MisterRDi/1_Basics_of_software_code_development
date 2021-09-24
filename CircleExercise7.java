import java.util.Scanner;

public class CircleExercise7
{
    public static void main(String[] args)
    {
        Scanner inInt = new Scanner(System.in);

        System.out.print("Введите целое положительное число (Начало диапазона): ");
        int m = inInt.nextInt();

        System.out.print("Введите целое положительное число (Конец диапазона): ");
        int n = inInt.nextInt();

        int a = Math.min(m, n);
        int b = Math.max(m, n);

        System.out.println("Начало диапазона: " + a);
        System.out.println("Конец диапазона: " + b + "\n");

        for (int i = a; i <= b; i++)  // рассматриваем число
        {

            System.out.print("Число: " + i + "\nДелители: ");

            int count = 0; // счетчик кол-ва делителей для данного числа

            int divider = 2;
            int remainder;

            while (divider <= i / divider) // определяем наличие делителя
            {
                remainder = i % divider;

                if (remainder == 0)
                {
                    System.out.print(divider);
                    divider += 1;
                    count += 1;
                    break;
                }

                divider += 1;

            }

            if (count == 0)
            {

                System.out.print("Отсутствуют");

            }
            else
            {

                while (divider <= i-1) // определяем остальные делители
                {

                    remainder = i % divider;

                    if (remainder == 0)
                    {

                        System.out.print("; " + divider);

                        count += 1;

                    }

                    divider += 1;

                }
            }

            System.out.println(". \n");

        }
    }
}
/*
вложенный цикл сделан, чтобы красиво расставить точки с запятой между делителями
и точки в конце строчек перечисления делителей.
*/