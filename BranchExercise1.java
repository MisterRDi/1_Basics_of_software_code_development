public class BranchExercise1
{
    public static void main (String[] args)
    {
        double angle1 = 10;
        double angle2 = 80;
        double angle3 = 90;

        double sumThreeAngles = angle1 + angle2 + angle3;

        boolean triangle = false;
        String isTriangle = "Это не треугольник";
        String isTriangleRight = "Это НЕ прямоугольный треугольник";
        //boolean triangle = sumThreeAngles == 180 ? true : false;

        if (0 < angle1 && angle1 < 180 && 0 < angle2 && angle2 < 180 && 0 < angle3 && angle3 < 180 && sumThreeAngles == 180)
        {
            triangle = true;
            isTriangle = "Это ТРЕУГОЛЬНИК";

        }

        if (triangle && (angle1 == 90 || angle2 == 90 || angle3 == 90))
        {
            isTriangleRight = "Это ПРЯМОУГОЛЬНЫЙ треугольник";
        }

        if (triangle)
        {
            System.out.println(triangle);
            System.out.println(isTriangle);
            System.out.println(isTriangleRight);
        }
        else
        {
            System.out.println(triangle);
            System.out.println(isTriangle);
        }
    }
}
