package MentorTasks.lesson4;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {

        Scanner Year = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = Year.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        } else
            System.out.println("Not a Leap Year");
    }
}