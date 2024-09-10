package MentorTasks.lesson25.Task2;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGrade(),o2.getGrade());
    }
}
