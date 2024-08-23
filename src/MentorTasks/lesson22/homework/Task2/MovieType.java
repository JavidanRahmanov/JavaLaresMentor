package MentorTasks.lesson22.homework.Task2;

public enum MovieType {

    ACTION(2),
    COMEDY(3),
    DRAMA(1),
    HORROR(0.5),
    ANIMATION(4);

    private double moviePrice;

    MovieType(double price) {
        this.moviePrice = price;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }
}
