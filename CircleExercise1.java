import java.util.Scanner;

public class CircleExercise1
{
    public static void main (String[] args)
    {
        // 1. Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.

        Scanner inInt = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int num = inInt.nextInt();
        System.out.println("Your number: " + num);
        // inInt.close();

        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum += i;
        }
        System.out.println("\n" + sum);
    }
}

