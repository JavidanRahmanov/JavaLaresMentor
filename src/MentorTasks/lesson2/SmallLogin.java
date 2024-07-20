package MentorTasks.lesson2;

import java.util.Scanner;

public class SmallLogin {
    public static  void main(String[] args) {


        Scanner passwordChecker = new Scanner(System.in);
        System.out.println("Welcome! Please enter your username:");
        String username = passwordChecker.nextLine();
        System.out.println("Please enter your password:");
        int password = passwordChecker.nextInt();
        if (username.equals("admin") && password == 12345) System.out.println("You are logged in");
        else System.out.println("You are not logged in");
        passwordChecker.close();
    }
}
