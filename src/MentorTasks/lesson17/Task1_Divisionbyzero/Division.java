package MentorTasks.lesson17.Task1_Divisionbyzero;

import java.util.Scanner;

public class Division {

    static double divideNumbers(int a, int b) throws DivisionByZeroException {
        if (b == 0)
            throw new DivisionByZeroException("Dividing by 0 is invalid!");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        try {
            System.out.println(divideNumbers(a, b));
        } catch (DivisionByZeroException e) {

            System.out.println("Exception is handled.. " + e.getMessage());
        }

    }
}
