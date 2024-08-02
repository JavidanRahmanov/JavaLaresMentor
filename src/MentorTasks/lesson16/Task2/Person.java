package MentorTasks.lesson16.Task2;

public class Person implements Swim, Walk{


    @Override
    public void swim() {

        System.out.println("Person isn't swimming");
    }

    @Override
    public void walk() {

        System.out.println("Person is walking");
    }
}
