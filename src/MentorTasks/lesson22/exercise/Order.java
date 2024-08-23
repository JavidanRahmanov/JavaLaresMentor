package MentorTasks.lesson22.exercise;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Pizza> pizzas = new ArrayList<>();
    Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaType.BBQ_CHICKEN);
    Pizza pizza2 = new Pizza(PizzaSize.LARGE, PizzaType.MARGHERITA);
    Pizza pizza3 = new Pizza(PizzaSize.MEDIUM, PizzaType.VEGGIE);

    public Order() {
        addPizza(pizza1);
        addPizza(pizza2);
        addPizza(pizza3);
    }

    void addPizza(Pizza pizza) {

        pizzas.add(pizza);
    }

    double totalSummary() {
        double summary = 0;
        for (Pizza pizza : pizzas) {

            summary += pizza.totalPrice();
        }
        return summary;
    }
}

