public class CircleExercise6
{
    public static void main(String[] args)
    {
        // 6. Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.

        for (int i = 0; i < 255; i++)
        {
            char symbol = (char) i;
            String symbolBinary = Integer.toBinaryString(symbol);
            System.out.println("#: | " + i + " | Char: | " + symbol + " | Bin: | " + symbolBinary + " |");
        }
    }
}
