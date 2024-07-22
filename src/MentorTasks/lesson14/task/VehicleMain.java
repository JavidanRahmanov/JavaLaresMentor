package MentorTasks.lesson14.task;

public class VehicleMain {
    public static void main(String[] args) {
        GroundVehicle bike = new GroundVehicle("Suzuki","Hayabusa",2023,299 ,2,"Inline-4");
        AirVehicle plane = new AirVehicle("Boeing","747",2023,988,68.4,66.5);
        WaterVehicle boat = new WaterVehicle("Sunseeker","Predator 55 EVO",2023,32,"Planing",1.450 );



        System.out.println("Bike's features: ");
        bike.accelerate();
        bike.brake();

        System.out.println("Plane's features: ");
        plane.accelerate();
        plane.brake();

        System.out.println("Boat's features: ");
        boat.accelerate();
        boat.brake();
    }
}
