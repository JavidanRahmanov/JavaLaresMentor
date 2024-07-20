package MentorTasks.lesson5;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;
        while (Math.sqrt(n) > i) {
            if (Math.sqrt(n) % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) System.out.println("The number " + n + " is a prime number");
        else System.out.println("The number " + n + " is not a prime number");
    }
}
