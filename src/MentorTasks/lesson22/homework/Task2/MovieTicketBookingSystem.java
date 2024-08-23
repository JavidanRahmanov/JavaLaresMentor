package MentorTasks.lesson22.homework.Task2;


import java.util.Scanner;

public class MovieTicketBookingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Booking booking = new Booking();
        double summary = booking.calculaTotalPrice();
        System.out.println(summary);
        System.out.println("Do you want to add something else?");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Popcorn\n" +
                    "Soda\n" +
                    "Candy");
            String choice2 = sc.nextLine();
            ConcessionItem[] addings = ConcessionItem.values();
            for (ConcessionItem adding : addings) {

                if (adding.getDescription().equalsIgnoreCase(choice2)) {
                    summary += adding.getPrice();
                }
            }
            System.out.println(summary);
        }
    }
}
