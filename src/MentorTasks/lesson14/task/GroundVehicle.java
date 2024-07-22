package MentorTasks.lesson14.task;

public class GroundVehicle extends Vehicle {
private int numWheels;
private String engineType;

    public GroundVehicle(String make, String model, int year, int topSpeed, int numWheels, String engineType) {
        super(make, model, year, topSpeed);
        this.numWheels = numWheels;
        this.engineType = engineType;
    }

    @Override
    void accelerate(){
    System.out.println(getMake()  + " weaves through traffic.");
    }

    @Override
    void brake(){
        System.out.println(getMake() + " is securely docked at the pier.");
    }
}
