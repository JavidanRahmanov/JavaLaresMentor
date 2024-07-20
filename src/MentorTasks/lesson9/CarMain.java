package MentorTasks.lesson9;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Car1: ", "Porsche", "911",2023,56200.5);
          car.display();
        System.out.println("Kilometres: " + car.milCalculate(car.mileage) + "km");
        System.out.println("Car age: " + car.carAge(car.year));
    }
}
