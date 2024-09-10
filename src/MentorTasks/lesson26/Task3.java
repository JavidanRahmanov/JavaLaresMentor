package MentorTasks.lesson26;

import java.util.Arrays;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Integer> nums  = Arrays.asList(5, 2, 8, 1, 9, 3, 2, 8, 5);

        List<Integer> sortedDistinctNums = nums.stream().distinct().sorted().toList();

        System.out.println("Distinct numbers in ascending order: " + sortedDistinctNums);
    }
}
