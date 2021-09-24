public class Exercise3
{
    public static void main (String[] args)
    {
        // (sin x + cos y) / (cos x - sin y) * tg(xy)

        double x = 70;
        double y = 10;

        double sinX = Math.sin(x);
        double cosX = Math.cos(x);

        double sinY = Math.sin(y);
        double cosY = Math.cos(y);

        double tgXY = Math.tan(x*y);

        double Expr = (sinX + cosY) / (cosX - sinY) * tgXY;

        System.out.println(Expr);
    }
}
