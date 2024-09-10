package MentorTasks.lesson24.Task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String paragraph = "The quick brown fox jumped over the lazy dog, but the lazy dog didn't notice because the lazy dog was too busy sleeping";
        String[] array = paragraph.split(" ");

        HashMap<String, Integer> arrayParagraph = new HashMap<>();
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String word = array[i].toLowerCase().replaceAll("[^a-zA-Z]", "");
            arrayParagraph.put(word, arrayParagraph.getOrDefault(word,0)+1);

        }

        for (int i = 0; i < array.length; i++) {
            String word = array[i].toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (arrayParagraph.get(word) == 1)
                uniqueWords.add(word);

        }
        System.out.println("Unique words: ");
        for (String uniqueWord : uniqueWords) {

            System.out.println(uniqueWord);
        }
    }
}
