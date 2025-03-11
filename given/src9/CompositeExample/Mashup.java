import java.util.List;

public class Mashup implements Song {
    private final List<Song> songs;

    public Mashup(List<Song> songs) {
        this.songs = songs;
    }

    public void add(Song song) {
        songs.add(song);
    }

    @Override
    public void sing() {
        for (Song song : songs) {
            song.sing();
        }
    }
}
