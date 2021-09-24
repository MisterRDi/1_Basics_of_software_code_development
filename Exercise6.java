public class Exercise6 {
    public static void main (String[] args)
    {
        int x;
        int y;

        x = -2;
        y = 1;

        if ((0 <= x && x <= 4 && -2 <= y && y <= 2) || (-3 <= x && x <= 0 && -4 <= y && y <= 4))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
