import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning() {

    }
    public String playSong(int num) {

    }
    public String prevSong() {

    }
    public String nextSong() {

    }
    public String stop() {

    }
    public String pause() {

    }
}
