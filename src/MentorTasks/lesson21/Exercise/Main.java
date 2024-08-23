package MentorTasks.lesson21.Exercise;

public class Main {

    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder(CoffeeType.AMERICANO,CoffeeSize.SMALL);
        CoffeeOrder order2 = new CoffeeOrder(CoffeeType.CAPPUCCINO,CoffeeSize.LARGE);

        System.out.println(order1);
        System.out.println(order2);
    }
}
