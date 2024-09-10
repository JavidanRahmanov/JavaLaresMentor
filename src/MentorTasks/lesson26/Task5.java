package MentorTasks.lesson26;

import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("hello", "world", "abcdefghij", "12345678905464", "short");

        List<String> collect = input.stream().filter(c -> c.length() <= 10).toList();
        for (String s : collect) {
            System.out.println(s);
        }

    }

}
