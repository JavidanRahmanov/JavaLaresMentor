package MentorTasks.lesson22.homework.Task2;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private double summary;

    List<Ticket> booking = new ArrayList<>();
//    List<ConcessionItem> bonus = new ArrayList<>();

    void addTicket(Ticket ticket) {
        addTicket(ticket);
    }

    public double getSummary() {
        return summary;
    }

    public Booking() {
        booking.add(ticket1);
        booking.add(ticket2);
        booking.add(ticket3);
    }

    double calculaTotalPrice() {

        for (Ticket ticket : booking) {
            summary += ticket.calculateTotalPrice();
        }
        return summary;
    }

    Ticket ticket1 = new Ticket(MovieType.ACTION, SeatType.STANDARD);
    Ticket ticket2 = new Ticket(MovieType.DRAMA, SeatType.PREMIUM);
    Ticket ticket3 = new Ticket(MovieType.ANIMATION, SeatType.VIP);
}
