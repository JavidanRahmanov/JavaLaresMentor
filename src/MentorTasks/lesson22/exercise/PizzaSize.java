package MentorTasks.lesson22.exercise;

public enum PizzaSize {

    SMALL(2.5),
    MEDIUM(3.5),
    LARGE(4.5);

    double multiplier;

    PizzaSize(double multiplier) {
        this.multiplier = multiplier;
    }


}

