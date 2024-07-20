package MentorTasks.lesson3;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount;
        String sourceCode;
        String targetCode;

        while (true) {
            System.out.println("Enter the amount to be converted: ");
            amount = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the source currency code: ");
            sourceCode = sc.nextLine().toUpperCase();
            System.out.println("Enter the target currency code: ");
            targetCode = sc.nextLine().toUpperCase();
            switch (sourceCode) {
                case "USD", "EUR", "AZN":
                    break;
                default:
                    System.out.println("                    ERROR                ");
                    System.out.println("Invalid source currency code");
                    continue;
            }
            switch (targetCode) {
                case "USD":
                    if (sourceCode.equals("AZN"))
                        amount = amount * 0.59;
                    if (sourceCode.equals("EUR") )
                        amount = amount * 1.09;
                    break;
                case "AZN":
                    if (sourceCode.equals("USD") )
                        amount = amount * 1.70;
                    if (sourceCode.equals("EUR"))
                        amount = amount * 1.84;
                    break;
                case "EUR":
                    if (sourceCode.equals("USD") )
                        amount = amount * 0.92;
                    if (sourceCode.equals("AZN") )
                        amount = amount * 0.54;
                    break;
                default:
                    System.out.println("                    ERROR                ");
                    System.out.println("Invalid target currency code");
                    continue;
            }
            System.out.println("Converted amount: " + amount + " " + targetCode);
            sc.close();
            if (sourceCode.equals(targetCode)) {
                System.out.println("Please enter different source and target currency codes.");
            } else {
                break;
            }
        }
    }
}