package MentorTasks.lesson20.homework;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String input = sc.nextLine();


        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, specialCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCount);


        StringBuilder alternatingCaseString = new StringBuilder();
        boolean isUpperCase = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (isUpperCase) {
                    alternatingCaseString.append(Character.toUpperCase(ch));
                } else {
                    alternatingCaseString.append(Character.toLowerCase(ch));
                }
                isUpperCase = !isUpperCase;
            } else {
                alternatingCaseString.append(ch);
            }
        }

        System.out.println("Alternating case string: " + alternatingCaseString);


        String[] words = alternatingCaseString.toString().split("\\s+");
        StringBuilder reversedWordsString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedWordsString.append(words[i]);
            if (i > 0) {
                reversedWordsString.append(" ");
            }
        }


        System.out.println("Reversed word order with alternating case: " + reversedWordsString);
    }
}
