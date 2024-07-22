package MentorTasks.lesson14.exercise;

public class Pet {
    private String name;
    private int age;
    private double weight;
    void eat(){
        System.out.println(name + "is eating");
    }
    void sleep(){
        System.out.println(name + "isn't sleeping");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Pet(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void makeSound(){
        System.out.println("Pet is sounding");
    }

    public String getName() {
        return name;
    }
}
