package MentorTasks.lesson25.Task2;

import java.util.Comparator;

public class GradeNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        int gradeComparison = Integer.compare(o1.getGrade(), o2.getGrade());
        if(gradeComparison==0)
            return o1.getName().compareTo(o2.getName());
        return Integer.compare(o1.getGrade(), o2.getGrade());
    }
}
