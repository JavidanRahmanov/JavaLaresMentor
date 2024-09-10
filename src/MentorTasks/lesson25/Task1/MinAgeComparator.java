package MentorTasks.lesson25.Task1;

import java.util.Comparator;

public class MinAgeComparator implements Comparator<Role> {
    @Override
    public int compare(Role o1, Role o2) {
        return Integer.compare(o1.getMinAge(),o2.getMinAge());
    }
}
