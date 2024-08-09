package MentorTasks.lesson18.Task_E_commerceOrderProcessingSystem;

import java.util.Scanner;

public class ECommerceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductCatalog productCatalog = new ProductCatalog();
        Order order = new Order(productCatalog);
        PaymentProcessor paymentProcessor1 = new PaymentProcessor(50000);
        boolean running = true;

        System.out.println("                     Welcome to JR's Computer Equipment Store                   ");
        while (running) {
            System.out.println("\nE-Commerce Menu:");
            System.out.println("1. List products");
            System.out.println("2. Add product to shopping cart");
            System.out.println("3. View shopping cart");
            System.out.println("4. Remove product from shopping cart");
            System.out.println("5. End shopping and pay");
            System.out.println("6. Add product to catalog");
            System.out.println("7. Remove product from catalog");
            System.out.println("8. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("List of products: ");
                    for (Product product : productCatalog.getProducts()) {
                        System.out.println(product);
                    }
                    break;

                case 2:
                    System.out.println("What do you want to order? (enter id)");
                    int addChoice = sc.nextInt();
                    System.out.println("How much do you want?");
                    int addCount = sc.nextInt();

                    try {
                        order.addProduct(addChoice, addCount);
                    } catch (ProductNotFoundException | InsufficientStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Shopping cart: ");
                    double totalAmount=0;
                    for (Product product : order.getOrderedProducts()) {
                        System.out.println(product);
                         totalAmount += product.getPrice()* product.getStockQuantity();
                    }
                    System.out.println("                                          Total amount: "+totalAmount);
                    break;

                case 4:
                    System.out.println("What do you want to remove? (enter id)");
                    int removeChoice = sc.nextInt();
                    System.out.println("How much do you want to remove?");
                    int removeCount = sc.nextInt();

                    try {
                        order.removeProduct(removeChoice, removeCount);
                    } catch (ProductNotFoundException | InsufficientStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        order. payOrder();
                        double remainingBalance = paymentProcessor1.pay(order.getTotalAmount());
                        if(remainingBalance== paymentProcessor1.getBalance())
                            continue;
                        System.out.println("Payment successful! Remaining balance: " + remainingBalance);
                    } catch (InsufficientStockException | ProductNotFoundException | PaymentProcessingException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 6:
                    System.out.println("Enter product id: ");
                    int productId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price = sc.nextDouble();
                    System.out.println("Enter product stock quantity: ");
                    int stockQuantity = sc.nextInt();
                    Product newProduct = new Product(productId, name, price, stockQuantity);
                    productCatalog.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;

                case 7:
                    System.out.println("Enter product id to remove: ");
                    int removeProductId = sc.nextInt();
                    try {
                        productCatalog.removeProduct(removeProductId);
                        System.out.println("Product removed successfully.");
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        System.out.println("Thank you for shopping from JR's Computer Equipment Store!");
    }
}
