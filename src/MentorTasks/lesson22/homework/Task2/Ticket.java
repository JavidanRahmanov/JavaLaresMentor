package MentorTasks.lesson22.homework.Task2;

public class Ticket {

    private MovieType movieType;
    private SeatType seatType;

    double calculateTotalPrice() {

        return movieType.getMoviePrice() * seatType.getSeatPrice();
    }

    public Ticket(MovieType movieType, SeatType seatType) {
        this.movieType = movieType;
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movieType=" + movieType +
                ", seatType=" + seatType +
                '}';
    }
}
