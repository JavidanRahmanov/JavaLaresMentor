package MentorTasks.lesson16.exercise;

public class Plane implements Flyable,Transport{
private int capacity;
private String destination;

    public Plane(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane is taking of");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
