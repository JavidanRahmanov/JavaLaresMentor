package MentorTasks.lesson21.Exercise;

public enum CoffeeType {

    ESPRESSO(3),
    LATTE(4),
    CAPPUCCINO(6),
    AMERICANO(8);

    int price;

    CoffeeType(int price) {
        this.price = price;
    }
}
