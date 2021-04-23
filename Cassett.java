import java.util.ArrayList;
/**
 * cassett class 
 * @author Harrison Andrade
 */
public class Cassett implements AnalogAlbum {
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
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        currentIndex = 0;
    }
    /**
     * plays the current song
     */
    public String play() {
        if (currentIndex >= songs.size()) {
            return "At the end of the cassett you need to rewind";
        }
        currentIndex++;
        return "Playing Song " + currentIndex + " : " + songs.get(currentIndex-1);
    }
    /**
     * rewinds to the last song
     */
    public String rewind() {
        if (currentIndex == 0) {
            return "Fully Re-wound";
        }
        currentIndex--;
        return "Rewinding to song " + (currentIndex+1);
    }
    /**
     * fast forwards to the next song
     */
    public String ffwd() {
        if (currentIndex == songs.size() - 2) {
            currentIndex++;
            return "Forwarded to the end of the cassett";
        }
        else if (currentIndex == songs.size() - 1) {
            return "At the end of the cassett you need to rewind";
        }
        currentIndex++;
        return "Forwarding to song " + (currentIndex+1);
    }
    /**
     * pauses
     */
    public String pause() {
        return "Pausing...";
    }
    /**
     * stops and ejects
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
