public class CircleExercise5
{
    public static void main (String[] args)
    {
        //5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
        // модуль которых больше или равен заданному е.

        int n = 20;
        double stepN = 1; // шаг изменения n
        double aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        double aN_minus_StepN = 1 / Math.pow(2, n - stepN) + 1 / Math.pow(3, n - stepN);
        double aN_plus_StepN = 1 / Math.pow(2, n + stepN) + 1 / Math.pow(3, n + stepN);

        double e = -0.0001;
        double eAbs = Math.abs(e);
        double sumThreeAN = aN_minus_StepN + aN + aN_plus_StepN;

        if (sumThreeAN > eAbs)
        {
            System.out.println("Сумму нужно уменьшить");

            while (sumThreeAN > eAbs)
            {
                n += stepN;
                aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
                aN_minus_StepN = 1 / Math.pow(2, n - stepN) + 1 / Math.pow(3, n - stepN);
                aN_plus_StepN = 1 / Math.pow(2, n + stepN) + 1 / Math.pow(3, n + stepN);
                sumThreeAN = aN_minus_StepN + aN + aN_plus_StepN;
            }

            n -= stepN;

            aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            aN_minus_StepN = 1 / Math.pow(2, n - stepN) + 1 / Math.pow(3, n - stepN);
            aN_plus_StepN = 1 / Math.pow(2, n + stepN) + 1 / Math.pow(3, n + stepN);
            sumThreeAN = aN_minus_StepN + aN + aN_plus_StepN;
        }
        else
        {
            System.out.println("Сумму нужно увеличить");

            while (sumThreeAN <= eAbs)
            {
                n -= stepN;
                aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
                aN_minus_StepN = 1 / Math.pow(2, n - stepN) + 1 / Math.pow(3, n - stepN);
                aN_plus_StepN = 1 / Math.pow(2, n + stepN) + 1 / Math.pow(3, n + stepN);
                sumThreeAN = aN_minus_StepN + aN + aN_plus_StepN;
            }
        }

        System.out.println(n);
        System.out.println(sumThreeAN);

    }
}
