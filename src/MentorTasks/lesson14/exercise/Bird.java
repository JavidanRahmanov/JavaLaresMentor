package MentorTasks.lesson14.exercise;

public class Bird extends Pet{
    private int wingspan;

    public Bird(String name, int age, double weight, int wingspan) {
        super(name, age, weight);
        this.wingspan = wingspan;
    }

    void fly(){
        System.out.println(getName() + "is flying");
    }

    @Override
    void makeSound(){
        System.out.println(getName() + "is chirping");
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}
