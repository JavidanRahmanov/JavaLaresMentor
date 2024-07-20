package MentorTasks.lesson8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books would you like to add?");
        int bookCount = sc.nextInt();
        sc.nextLine();
        String[][] library = new String[bookCount][2];
        for (int i = 0; i < bookCount; i++) {

            System.out.print(i + 1 + " Book name: ");
            library[i][0] = sc.nextLine();
            System.out.print(i + 1 + " Book author: ");
            library[i][1] = sc.nextLine();
        }
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Book name: " + library[i][0] + " Author: " + library[i][1]);
        }

        sc.close();
    }
}
