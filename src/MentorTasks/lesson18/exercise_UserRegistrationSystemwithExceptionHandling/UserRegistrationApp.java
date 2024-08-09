package MentorTasks.lesson18.exercise_UserRegistrationSystemwithExceptionHandling;

import java.util.Scanner;

public class UserRegistrationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        try {
            UserRegistration.registerUser(username,password);
        } catch (UserRegistrationException e) {
            System.out.println("Exception is handled"+ e);
        }
        finally {
            scanner.close();
        }
    }
}
