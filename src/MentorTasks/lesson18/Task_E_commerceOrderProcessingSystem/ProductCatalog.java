package MentorTasks.lesson18.Task_E_commerceOrderProcessingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ProductCatalog {
    private List<Product> products;

    Product product1 = new Product(101, "Wireless Mouse", 25.99, 15);
    Product product2 = new Product(102, "Bluetooth Headphones", 49.99, 5);
    Product product3 = new Product(103, "Mechanical Keyboard", 79.99, 6);
    Product product4 = new Product(104, "4K Monitor", 299.99, 3);
    Product product5 = new Product(105, "USB-C Hub", 19.99, 20);
    Product product6 = new Product(106, "Portable SSD", 99.99, 12);

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductCatalog() {
        products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int id) throws ProductNotFoundException {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == id) {
                iterator.remove();
                return;
            }
        }
        throw new ProductNotFoundException("Product not found!");
    }

    public Product updateProduct(int id, int count, String order) throws ProductNotFoundException, InsufficientStockException {
        for (Product product : products) {
            if (product.getProductId() == id) {
                product.updateStockQuantity(count, order);
                return product;
            }
        }
        throw new ProductNotFoundException("Product not found!");
    }
}
