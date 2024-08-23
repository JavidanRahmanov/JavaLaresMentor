package MentorTasks.lesson22.homework.Task1;

import java.util.Scanner;

public class TrafficLightSimulation {

    public static void main(String[] args) {

        TrafficLightController tlc = new TrafficLightController();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Current State: " + tlc.getCurrentState());
            System.out.println("Press enter to switch to the next state... ");
            sc.nextLine();

            tlc.nextState();
            System.out.println("Do you want to see this simulation automatically?");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Please enter cycle count that you want to see simulation to continue: ");
                int cycles = sc.nextInt();
                sc.nextLine();
                tlc.runSimulation(cycles);
            }
        }
    }
}
