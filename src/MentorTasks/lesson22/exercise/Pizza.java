package MentorTasks.lesson22.exercise;

public class Pizza {

 private PizzaSize pizzaSize;
 private PizzaType pizzaType;

 double totalPrice(){
    return pizzaSize.multiplier*pizzaType.price;
 }

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", pizzaType=" + pizzaType +
                '}';
    }
}
