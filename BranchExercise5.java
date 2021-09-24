public class BranchExercise5
{
    public static void main (String[] args)
    {
        // 5. Вычислить значение функции

        double x = 4;
        final int a1 = 3;
        final int a2 = 9;
        final int a3 = 1;
        final int a4 = 6;
        final int xPowIndex1 = 2;
        final int xPowIndex2 = 3;
        double xSquared = Math.pow(x, xPowIndex1);
        double xCubed = Math.pow(x, xPowIndex2);

        double fX = x<=3 ? xSquared - a1 * x + a2 : a3 / (xCubed + a4);

        double fXSimple = x<=3 ? x * x - 3 * x + 9 : 1 / (x * x * x + 6);

        System.out.println(fX + "\n" + fXSimple);
    }
}
