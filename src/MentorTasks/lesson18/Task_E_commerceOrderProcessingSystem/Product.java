package MentorTasks.lesson18.Task_E_commerceOrderProcessingSystem;

public class Product {

    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public String toString() {
        return "productId: " + productId +
                ", name: " + name +
                ", price: " + price +
                ", stockQuantity: " + stockQuantity;
    }

    public void setStockQuantity(int count) throws InsufficientStockException {
        if (stockQuantity - count < 0) throw new InsufficientStockException("Not enough stock!");
        this.stockQuantity -= count;
    }

    public void updateStockQuantity(int count, String order) throws InsufficientStockException {
        if (order.equals("add")) {
            if (stockQuantity < count) throw new InsufficientStockException("Not enough stock!");
            this.stockQuantity -= count;
        } else if (order.equals("remove")) {
            this.stockQuantity += count;
        }
    }
}
