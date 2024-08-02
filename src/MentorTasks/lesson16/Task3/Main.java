package MentorTasks.lesson16.Task3;

public class Main {

    public static void main(String[] args) {

        GroceryShopping shopping = new GroceryShopping();

        Product dairy = new Dairy("Milk",5.5,4.6);
        Product freshProduce = new FreshProduce("Apple",2.3,3.6);
        Product meat = new Meat("Beef", 14.5, 23.5);

        shopping.addProduct(dairy);
        shopping.addProduct(freshProduce);
        shopping.addProduct(meat);

        shopping.printReceipt();
        System.out.println("Total cost: " +shopping.calculateTotalCost());
    }
}
