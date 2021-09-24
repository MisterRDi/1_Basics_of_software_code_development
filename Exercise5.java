public class Exercise5
{
    public static void main (String[] args)
    {
        int totalSeconds = 18_367;
        final int dividerMin = 60;
        final int dividerHours = dividerMin * dividerMin;

        int hours = totalSeconds / (dividerHours); // Hours number

        int reminderMinSec = totalSeconds - hours * dividerHours;
        int minutes = reminderMinSec / (dividerMin); // Minutes number

        int seconds = totalSeconds - hours * dividerHours - minutes * dividerMin; // Seconds number

        String hoursToDisplay = (hours < 10) ? "0" + hours : "" + hours;
        String minutesToDisplay = (minutes < 10) ? "0" + minutes : "" + minutes;
        String secondsToDisplay = (seconds < 10) ? "0" + seconds : "" + seconds;

        System.out.println(hoursToDisplay + "ч" + " "
                         + minutesToDisplay + "мин" + " "
                         + secondsToDisplay + "с" + " ");
    }
}
