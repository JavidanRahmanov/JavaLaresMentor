package MentorTasks.lesson25.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 90);
        Student student3 = new Student("Charlie", 78);
        Student student4 = new Student("David", 92);
        Student student5 = new Student("Eva", 88);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students);

        Collections.sort(students,new GradeComparator());
        Collections.sort(students,new GradeNameComparator());

    }
}
