package MentorTasks.lesson14.task;

public class WaterVehicle extends Vehicle {
    private String hullType;
    private double enginePower;

    public WaterVehicle(String make, String model, int year, int topSpeed, String hullType, double enginePower) {
        super(make, model, year, topSpeed);
        this.hullType = hullType;
        this.enginePower = enginePower;
    }

    @Override
    void accelerate(){
        System.out.println(getMake() + " cuts through the waves gracefully.");
    }

    @Override
    void brake(){
        System.out.println(getMake() + "  is secured at the dock.");
    }

}
