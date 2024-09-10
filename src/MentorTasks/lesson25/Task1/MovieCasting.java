package MentorTasks.lesson25.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieCasting {

    public static void main(String[] args) {

        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("John Doe", 25, 8));
        actors.add(new Actor("Jane Smith", 30, 9));
        actors.add(new Actor("Sam Brown", 22, 7));
        actors.add(new Actor("Lucy Green", 35, 10));


        List<Role> roles = new ArrayList<>();
        roles.add(new Role("Hero", 20, 30));
        roles.add(new Role("Villain", 30, 40));
        roles.add(new Role("Sidekick", 20, 25));
        roles.add(new Role("Extra", 18, 35));

        Collections.sort(actors, new ActingSkillComparator());
        Collections.sort(roles, new MinAgeComparator());

        for (Actor actor : actors) {

            for (Role role : roles) {
                if (role.getMinAge() <= actor.getAge() & role.getMaxAge() >= role.getMaxAge())
                    System.out.println(actor.getName() + " is cast as " + role.getRoleName() + "(" + actor.getAge() + ")");
            }
        }

    }

}
