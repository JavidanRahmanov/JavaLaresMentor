package MentorTasks.lesson15.task2;

public class TimeCalculator {

    public static void calculateDifference(int hour1, int minute1, int hour2, int minute2) {

        if (!isValidTime(hour1, minute1) || !isValidTime(hour2, minute2)) {
            System.out.println("Invalid time values provided.");
            return;
        }

        int firstHour = hour1 * 60 + minute1;
        int secondHour = hour2 * 60 + minute2;

        int difference = secondHour - firstHour;
        System.out.println("There is " + difference / 60 + " hour " + difference % 60 + " minutes difference.");
    }

    public static void calculateDifference(String time1, String time2) {
        try {
            String[] splittedHour1 = time1.trim().split(":");
            int hour1 = Integer.parseInt(splittedHour1[0]);
            int minute1 = Integer.parseInt(splittedHour1[1]);
            String[] splittedHour2 = time2.trim().split(":");
            int hour2 = Integer.parseInt(splittedHour2[0]);
            int minute2 = Integer.parseInt(splittedHour2[1]);

            calculateDifference(hour1, minute1, hour2, minute2);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid time format provided.");
        }
    }

    private static boolean isValidTime(int hour, int minute) {
        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
    }

    public static void main(String[] args) {
        calculateDifference(10, 30, 14, 15);
        calculateDifference(" 10:30 ", " 14:15");
        calculateDifference("25:00", "14:15");
        calculateDifference("10:70", "14:15");
        calculateDifference("10:30", "invalid");
    }
}
