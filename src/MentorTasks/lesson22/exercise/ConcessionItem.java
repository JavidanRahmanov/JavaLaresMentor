package MentorTasks.lesson22.exercise;

public enum ConcessionItem {

    CHEESE(0.25,"cheese"),
    TOMATO(0.4,"tomato"),
    OLIVES(0.5,"olives"),
    MUSHROOMS(0.5,"mushrooms");

    double price;
    String description;

    ConcessionItem(double price, String description) {
        this.price = price;
        this.description=description;
    }
}
