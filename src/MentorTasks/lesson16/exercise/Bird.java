package MentorTasks.lesson16.exercise;

public class Bird implements Animal, Flyable {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is warbling");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void land() {
        System.out.println(getName() + " is landing");
    }
}
