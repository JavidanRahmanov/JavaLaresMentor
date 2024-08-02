package MentorTasks.lesson16.Task3;

public abstract class Product {

private String name;
private double unitPrice;
private double amount;

    public Product(String name, double unitPrice, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCost(){
        return unitPrice*amount;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
