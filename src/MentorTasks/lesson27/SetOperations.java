package MentorTasks.lesson27;

import java.util.Arrays;
import java.util.HashSet;

public class SetOperations {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        union(set1, set2);
        intersection(set1,set2);
        notIntersection(set1,set2);
    }

    public static void union(HashSet<Integer> set1, HashSet<Integer> set2) {
        set1.addAll(set2);

        for (Integer i : set1) {

            System.out.println(i);
        }
    }

   static void intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> newHahSet = new HashSet<>(set1);
        newHahSet.retainAll(set2);

       for (Integer i : newHahSet) {

           System.out.println(i);
       }

    }

    static void notIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);


        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);


        unionSet.removeAll(intersectionSet);


        for (Integer i : unionSet) {
            System.out.println(i);
        }
    }
}

