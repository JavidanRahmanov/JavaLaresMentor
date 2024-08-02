package MentorTasks.lesson17.Task3_LoginSystem;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        try {
            if (!AuthenticateManagement.login(userName, password))
                throw new AuthenticationException("Invalid username or password!");
            System.out.println("Login successful!");
        } catch (AuthenticationException e) {
            System.out.println("Exception is handled " + e);
        }

    }
}
