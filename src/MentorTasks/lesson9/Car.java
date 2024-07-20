package MentorTasks.lesson9;

public class Car {
    String name;
    String make;
    String model;
    int year;
    double mileage;


    public Car(String name, String make, String model, int year, double mileage) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }

    double milCalculate(double mileage) {
        return mileage * 1.6;

    }

    int carAge(int year) {
        return 2024 - year;
    }
}


