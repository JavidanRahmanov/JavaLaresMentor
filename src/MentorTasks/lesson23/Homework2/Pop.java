package MentorTasks.lesson23.Homework2;

public class Pop implements Music{

    private String title;
    private String artist;
    private int duration;

    public Pop(String title, String artist, int duration) {
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
