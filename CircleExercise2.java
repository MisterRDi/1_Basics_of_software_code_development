public class CircleExercise2
{
    public static void main (String[] args)
    {
        // 2. Вычислить значения функции на отрезке [а,b] c шагом h:

        int a = -5;
        int b = 10;
        // int y;

        for (int x = a; x <= b; x++)
        {
            int y = x > 2 ? x : -x;

            System.out.println("x= " + x + " ; " + "y= " + y);
        }
    }
}
