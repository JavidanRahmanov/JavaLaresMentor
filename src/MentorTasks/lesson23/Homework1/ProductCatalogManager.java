package MentorTasks.lesson23.Homework1;

import java.util.Scanner;

public class ProductCatalogManager {

    public static void main(String[] args) {

        ProductCatalog productCatalog = new ProductCatalog();

        Scanner sc = new Scanner(System.in);
        Product product1 = new Product("ball", 2.5, "sport");
        Product product2 = new Product("ball", 2.5, "sport");
        Product product3 = new Product("ball", 2.5, "sport");

        productCatalog.uniqueProducts.add(product1);
        productCatalog.uniqueProducts.add(product2);
        productCatalog.uniqueProducts.add(product3);



        while (true) {

            System.out.println("1.Add product\n" +
                    "2.Remove product\n" +
                    "3.Search product\n" +
                    "4.Print catalog\n" +
                    "5.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter product category: ");
                    String category = sc.nextLine();
                    Product product = new Product(name, price, category);
                    productCatalog.addProduct(product);
                    break;
                case 2:
                    System.out.println("Enter product name: ");
                    String name1 = sc.nextLine();
                    try {
                        productCatalog.removeProduct(name1);
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter product name: ");
                    String name2 = sc.nextLine();
                    try {
                        productCatalog.containsProduct(name2);
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        productCatalog.printCatalog();
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.exit(0);

            }

        }

    }
}