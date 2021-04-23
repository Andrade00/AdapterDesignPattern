import java.util.ArrayList;

/**
 * CD class
 * @author Harrison Andrade
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * constructor
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        currentIndex = 0;
    }
    /**
     * plays from the beginning and advances song
     */
    public String playFromBeginning() {
        currentIndex = 1;
        return "Playing song 1:" + songs.get(currentIndex-1);
    }
    /**
     * plays specificed song
     * @param num
     */
    public String playSong(int num) {
        if (num <= songs.size() && num > 0) {
            return "Playing..." + songs.get(num-1);
        }
        return "Not a valid song number";
    }
    /**
     * plays previous song
     */
    public String prevSong() {
        if (currentIndex != 0) {
            currentIndex--;
        }
        return "Skipping back and playing: " + songs.get(currentIndex-1);
    }
    /**
     * plays next song
     */
    public String nextSong() {
        if (currentIndex > songs.size()-1) {
            currentIndex = -1;
        }
        currentIndex++;
        return "Playing: " + currentIndex + ": " + songs.get(currentIndex-1);
    }
    /**
     * stops and ejects
     */
    public String stop() {
        currentIndex = 0;
        return "Stopping cassett and ejecting";
    }
    /**
     * pauses
     */
    public String pause() {
        return "Pausing...";
    }
}
