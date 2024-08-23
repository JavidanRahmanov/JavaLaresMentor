package MentorTasks.lesson22.homework.Task2;

public enum SeatType {

    STANDARD(0.5),
    PREMIUM(1),
    VIP(2);

    private double seatPrice;

    SeatType(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }
}
