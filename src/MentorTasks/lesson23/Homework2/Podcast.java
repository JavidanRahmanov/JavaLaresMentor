package MentorTasks.lesson23.Homework2;

public class Podcast implements Playable {
    private String title;
    private int duration;

    public String getDetails() {
        return "Rock{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Podcast(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
