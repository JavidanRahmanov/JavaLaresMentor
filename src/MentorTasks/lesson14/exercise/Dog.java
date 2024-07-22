package MentorTasks.lesson14.exercise;

public class Dog extends Pet{
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    void makeSound(){
    System.out.println(getName() + " barks ");
}
}
