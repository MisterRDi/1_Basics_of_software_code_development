public class BranchExercise4
{
    public static void main (String[] args)
    {
        // 4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        // Определить, пройдет ли кирпич через отверстие.

        int a = 121; // Размеры отверстия
        int b = 80;

        int x = 120; // Размеры отверстия
        int y = 200;
        int z = 79;

        int smallestXY = Math.min(x, y);
        int smallestBrick = Math.min(smallestXY, z); // Сторона кирпича с минимальным размером

        int smallestHole = Math.min(a, b); // Сторона отверстия с минимальным размером

        String compareMin = "Кирпич не пролезет";

        if (smallestHole <= smallestBrick) // Сравниваем наименьшие размеры
        {
            System.out.println (compareMin);
        }
        else
        {
            compareMin = "Исследуем дальше";
        }

        if (compareMin == "Исследуем дальше")
        {
            int anotherBrickSmallSide = x; // находим вторую малую сторону кирпича

            if (smallestBrick == x) {
                anotherBrickSmallSide = Math.min(y, z);
            }
            else if (smallestBrick == y)
            {
                anotherBrickSmallSide = Math.min(x, z);
            }
            else
            {
                anotherBrickSmallSide = smallestXY;
            }

            int anotherHoleSmallSide = smallestHole == a ? b : a; // находим вторую сторону отверстия

            String compareAnotherSide = anotherHoleSmallSide <= anotherBrickSmallSide
                                        ? "Кирпич не пролезет" : "Кирпич ПРОЛЕЗЕТ !!!";

            System.out.println (compareAnotherSide);
        }
    }
}
