package MentorTasks.lesson23.Homework2;

public class Rap implements Music{

    private String title;
    private String artist;
    private int duration;

    public Rap(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getDetails() {
        return "Rock{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}