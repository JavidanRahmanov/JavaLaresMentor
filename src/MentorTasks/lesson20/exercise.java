package MentorTasks.lesson20;

import java.util.Scanner;

public class exercise {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            StringBuilder reversed = new StringBuilder();

            for (int i = words.length-1; i >=0 ; i--) {
                reversed.append(words[i]);

                if(i!=0)
                    reversed.append(" ");
            }

            System.out.println("Reversed sentence: " + reversed);

            for (int i = 0; i < reversed.length(); i++) {

                char letter = reversed.charAt(i);

                if(letter == 'a')
                    reversed.setCharAt(i,'e');
            }

            System.out.println("Modified sentence: " +reversed);

            StringBuilder finalOutput = new StringBuilder();
            finalOutput.append(sentence).append("\n").append(reversed);

            System.out.println("Final form: " +finalOutput);
        }

    }
