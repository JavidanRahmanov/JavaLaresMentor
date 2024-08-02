package MentorTasks.lesson16.Task2;

public class Duck implements Swim,Fly,Walk{


    @Override
    public void fly() {

        System.out.println("Duck isn't flying");
    }

    @Override
    public void swim() {

        System.out.println("Duck is swimming");
    }

    @Override
    public void walk() {

        System.out.println("Duck is walking");
    }
}
