package MentorTasks.lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operation: ");
        sc.nextLine();
        String operation = sc.nextLine();
        switch (operation) {
            case "+":
                double add = num1 + num2;
                System.out.println(add);
                break;
            case "-":
                double subtract = num1 - num2;
                System.out.println(subtract);
                break;
            case "*":
                double multiply = num1 * num2;
                System.out.println(multiply);
                break;
            case "/":
                double divide = num1 / num2;
                System.out.println(divide);
                break;
            default:
                System.out.println("Invalid operation");
                sc.close();
        }
    }
}
