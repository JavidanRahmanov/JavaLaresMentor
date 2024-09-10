package MentorTasks.lesson26;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    private String title;
    private String genre;

    public Task1(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public static void main(String[] args) {


        Task1 movie1 = new Task1("The Shawshank Redemption", "Drama");
        Task1 movie2 = new Task1("The Dark Knight", "Action");
        Task1 movie3 = new Task1("Pulp Fiction", "Crime");
        Task1 movie4 = new Task1("Fight Club", "Drama");
        Task1 movie5 = new Task1("The Matrix", "Sci-Fi");
        Task1 movie6 = new Task1("Goodfellas", "Crime");
        Task1 movie7 = new Task1("Inception", "Sci-Fi");

        List<Task1> movies = Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6, movie7);

        List<String> uniqueGenres = movies.stream().map(Task1::getGenre).distinct().sorted().toList();

        System.out.println("Unique sorted genres: " + uniqueGenres);

    }
}
