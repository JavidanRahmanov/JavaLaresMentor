package MentorTasks.lesson21.Exercise;

public class CoffeeOrder {

    CoffeeType coffeeType;
    CoffeeSize coffeeSize;

    double price;

    public CoffeeOrder(CoffeeType coffeeType, CoffeeSize coffeeSize) {
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
        price=coffeeSize.multipiler* coffeeType.price;
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffeeType=" + coffeeType +
                ", coffeeSize=" + coffeeSize +
                ", price=" + price +
                '}';
    }
}
