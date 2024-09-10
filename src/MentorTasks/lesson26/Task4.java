package MentorTasks.lesson26;

import MentorTasks.lesson23.Homework1.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 999.99, "Electronics");
        Product smartphone = new Product("Smartphone", 799.99, "Electronics");
        Product deskChair = new Product("Desk Chair", 149.99, "Furniture");
        Product book = new Product("Book", 19.99, "Books");
        Product headphones = new Product("Headphones", 199.99, "Electronics");
        Product coffeeMaker = new Product("Coffee Maker", 89.99, "Appliances");
        Product notebook = new Product("Notebook", 2.99, "Stationery");

        List<Product> products = Arrays.asList(laptop,smartphone,deskChair,book,headphones,coffeeMaker,notebook);

        List<Product> filteredSortedProducts = products.stream().filter(product -> "Electronics".equals(product.getCategory()))
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        filteredSortedProducts.forEach(product ->
                System.out.println(product.getName() + ": $" + product.getPrice())
        );
    }

}
