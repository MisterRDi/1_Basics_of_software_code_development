public class BranchExercise2
{
    public static void main (String[] args)
    {
        int a = 8;
        int b = 9;
        int c = 5;
        int d = 4;
        /*
        int minAB = Math.min(a, b); // минимум A-B
        int minCD = Math.min(c, d); // минимум C-D
        int maxMin = Math.max(minAB, minCD); // максимум
        */
        int maxMin = Math.max(Math.min(a, b), Math.min(c, d)); // Компактный способ

        System.out.println(maxMin);
    }
}
