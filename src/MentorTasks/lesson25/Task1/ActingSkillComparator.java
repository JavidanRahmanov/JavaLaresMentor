package MentorTasks.lesson25.Task1;

import java.util.Comparator;

public class ActingSkillComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getActingSkill(),o2.getActingSkill());
    }
}
