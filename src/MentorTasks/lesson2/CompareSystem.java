package MentorTasks.lesson2;

import java.util.Random;
import java.util.Scanner;


     public class CompareSystem {
        public static void main(String[] args) {
            Scanner compare = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Enter the first number: ");
            int num1 = compare.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = compare.nextInt();
            System.out.println("Enter the third number: ");
            int num3 = compare.nextInt();
            int largest = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number: " + largest);
            int randomNumber = random.nextInt(11);

            if (largest == randomNumber) {
                System.out.println("The largest number is equal to the random number.");
            } else {
                System.out.println("Random number: " + randomNumber + " not equals with: " + largest);
            }
            compare.close();
        }
    }
