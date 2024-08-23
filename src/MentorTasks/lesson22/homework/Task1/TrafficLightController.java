package MentorTasks.lesson22.homework.Task1;

public class TrafficLightController {

    private TrafficLight currentState;

    public TrafficLightController() {
        this.currentState = TrafficLight.RED;
    }

    public void nextState() {

        switch (currentState) {

            case RED:
                currentState = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currentState = TrafficLight.GREEN;
                break;
            case GREEN:
                currentState = TrafficLight.RED;
                break;
        }
    }

    public TrafficLight getCurrentState() {

        return this.currentState;
    }

    public double getCurrentStateDuration() {

        return this.currentState.getDuration();
    }

    public void runSimulation(int cycles) {

        while (cycles > 0) {
            try {
                System.out.println("Current State: " + currentState);
                Thread.sleep((long) (currentState.getDuration() * 1000L));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextState();

            if (currentState == TrafficLight.RED) {
                cycles--;
            }
        }
    }
}
