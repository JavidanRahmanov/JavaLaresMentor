package MentorTasks.lesson22.exercise;

public enum PizzaType {

    MARGHERITA(3),
    PEPPERONI(4),
    VEGGIE(6),
    BBQ_CHICKEN(8);
    double price;

    PizzaType(double price) {
        this.price = price;
    }
}
