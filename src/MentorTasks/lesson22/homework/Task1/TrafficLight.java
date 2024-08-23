package MentorTasks.lesson22.homework.Task1;

public enum TrafficLight {

    RED(4.5),
    YELLOW(1),
    GREEN(4.5);

    private final double duration;

    TrafficLight(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

}
