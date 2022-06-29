public class SecondsAndMinutesChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        //check if works when two values are given
        System.out.println(getDurationString(949, 0));
        //check if works when one value is given
        System.out.println(getDurationString(843848));
        //check if works when negative value is given
        System.out.println(getDurationString(-2));

    }
    // creating a method with two parameters
    public static String getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int minutesToHours = minutes / 60;
            minutes %= 60;
            return minutesToHours + " h " + minutes + " min " + seconds + " s";
        }
    }
    //overloading a method
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int minutesFromSeconds = seconds / 60;
            seconds %= 60;
            return getDurationString(minutesFromSeconds, seconds);
        }
    }
}