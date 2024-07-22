package MentorTasks.lesson14.exercise;

public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, 12.5, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3, 4.5, "Brown");
        Bird bird = new Bird("Parrot", 2, 0.5, 30);

        cat.makeSound();
        dog.makeSound();
        bird.makeSound();
    }
}
