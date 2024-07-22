package MentorTasks.lesson14.task;

public class AirVehicle extends Vehicle {
    private double wingspan;
    private double enginePower;

    public AirVehicle(String make, String model, int year, int topSpeed,  double wingspan, double enginePower) {
        super(make, model, year, topSpeed);
        this.wingspan = wingspan;
        this.enginePower = enginePower;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    void brake(){
        System.out.println(super.getMake() + " gracefully lifts off the runway");
    }

    @Override
    void accelerate(){
        System.out.println(super.getMake() + " touches down on the runway.");
    }

}
