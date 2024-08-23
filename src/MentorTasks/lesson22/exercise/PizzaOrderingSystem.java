package MentorTasks.lesson22.exercise;

import java.util.Scanner;

public class PizzaOrderingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConcessionItem[] toppings = ConcessionItem.values();
        Order order = new Order();
        double totalSummary = order.totalSummary();
        System.out.println("What other toppings do you want to add? ");
        String name = sc.nextLine();
        for (ConcessionItem topping : toppings) {

            if(topping.description.equalsIgnoreCase(name))
                totalSummary+=topping.price;
        }
            System.out.println(totalSummary);

    }
}
