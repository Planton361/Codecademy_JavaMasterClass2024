public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDuration(5000));
        System.out.println(getDuration(73, 6000));
        System.out.println(getDuration(-1000));
        System.out.println(getDuration(100000, -10));
        System.out.println(getDuration(-100, 10));
    }

    public static String getDuration(int seconds) {
        if (seconds > 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDuration(minutes, seconds);
        }
        return "Invalid number";
    }

    public static String getDuration(int minutes, int seconds) {
        if (minutes > 0 && seconds <= 59 && seconds > 0) {
            int hours = (minutes * 60 + seconds) / 3600;
            minutes = ((minutes * 60 + seconds) % 3600) / 60;
            String duration = hours + " HH " + minutes + " MM " + seconds + " SS ";
            return duration;
        }
        return "Invalid number";
    }
}
