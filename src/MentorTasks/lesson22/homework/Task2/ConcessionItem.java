package MentorTasks.lesson22.homework.Task2;

public enum ConcessionItem {

    POPCORN("popcorn",0.6),
    SODA("soda",0.7),
    CANDY("candy",1);

    private String description;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    ConcessionItem(String description, double price) {
        this.description = description;
        this.price = price;
    }
}
