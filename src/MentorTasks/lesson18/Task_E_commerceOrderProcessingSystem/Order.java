package MentorTasks.lesson18.Task_E_commerceOrderProcessingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private double totalAmount;
    private List<Product> orderedProducts;
    private ProductCatalog productCatalog;

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Order(ProductCatalog productCatalog) {
        this.orderedProducts = new ArrayList<>();
        this.productCatalog = productCatalog;
    }

    public void addProduct(int id, int count) throws ProductNotFoundException, InsufficientStockException {
        Product product = productCatalog.updateProduct(id, count, "add");
        orderedProducts.add(new Product(product.getProductId(), product.getName(), product.getPrice(), count));
    }

    public void payOrder() throws InsufficientStockException, ProductNotFoundException {
        if(orderedProducts.isEmpty()){
            System.out.println("Shopping cart is empty!");
              return;
        }
        for (Product product : orderedProducts) {
            totalAmount += product.getPrice() * product.getStockQuantity();

        }
        orderedProducts.clear();
    }

    public void removeProduct(int id, int count) throws ProductNotFoundException, InsufficientStockException {
        Product product = null;
        for (Product p : orderedProducts) {
            if (p.getProductId() == id) {
                product = p;
                break;
            }
        }
        if (product != null) {
            productCatalog.updateProduct(id, count, "remove");
            if (product.getStockQuantity() == count) {
                orderedProducts.remove(product);
            } else {
                product.setStockQuantity(count);
            }
        } else {
            throw new ProductNotFoundException("Product not found in order!");
        }
    }
}
