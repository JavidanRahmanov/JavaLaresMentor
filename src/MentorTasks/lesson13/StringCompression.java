package MentorTasks.lesson13;


import java.util.ArrayList;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a string: ");
        String word = sc.nextLine();
        ArrayList<Character> elements = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1))
                count++;
            else {
                char e = (char) count;
                elements.add(word.charAt(i));
                elements.add(e);
            }
        }
        if (word.length() > elements.size()) {
            for (char e : elements) {
                System.out.print(e);
            }
        } else
            System.out.println(word);
    }
}

