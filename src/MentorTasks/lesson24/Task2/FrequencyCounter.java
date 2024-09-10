package MentorTasks.lesson24.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");



        for (String word : words) {
           word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            map.put(word,map.getOrDefault(word,0)+1);

        }

        for(Map.Entry<String,Integer> entry: map.entrySet()){

            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
