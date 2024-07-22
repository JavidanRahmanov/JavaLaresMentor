package MentorTasks.lesson14.task;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int topSpeed;

    public Vehicle(String make, String model, int year, int topSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
    }
    void accelerate(){
        System.out.println(make + " accelerates quickly");
    }
    void brake(){
        System.out.println(make + " comes to a smooth stop.");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
