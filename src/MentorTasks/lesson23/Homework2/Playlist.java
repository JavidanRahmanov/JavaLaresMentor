package MentorTasks.lesson23.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Playlist<T extends Playable> {

    private final List<T> playables;

    public Playlist() {
        this.playables = new ArrayList<>();
    }

    void addToList(T playable) {
        playables.add(playable);
    }

    void printDetails() {
        for (T playable : playables) {
            System.out.println(playable.getDetails());
        }
    }

    public static void main(String[] args) {


        Playlist<Music> musicPlaylist = new Playlist();
        musicPlaylist.addToList(new Rock("Stairway to Heaven", "Led Zeppelin", 482));
        musicPlaylist.addToList(new Pop("Thriller", "Michael Jackson", 358));
        musicPlaylist.addToList(new Rap("Lose Yourself", "Eminem", 326));


        System.out.println("Music Playlist:");
        musicPlaylist.printDetails();

        Playlist<Podcast> podcastPlaylist = new Playlist<>();
        podcastPlaylist.addToList(new Podcast("The Daily", 1200));
        podcastPlaylist.addToList(new Podcast("Science Vs", 1500));

        System.out.println("\nPodcast Playlist:");
        podcastPlaylist.printDetails();

    }
}
