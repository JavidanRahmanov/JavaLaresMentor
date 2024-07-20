package MentorTasks.lesson7;

import java.util.Random;

public class ArrayWorkout {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        int cem = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
            cem += arr[i];
        }
        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println("Ededi orta: " + cem / arr.length);
    }
}
