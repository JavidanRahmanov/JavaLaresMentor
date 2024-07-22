package MentorTasks.lesson14.exercise;

public class Cat extends Pet{
    private String furColor;

    public Cat(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " meows");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
