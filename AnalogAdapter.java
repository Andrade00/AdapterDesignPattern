
/**
 * analog adapter class
 * @author Harrison Andrade
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;
    /**
     * constructor
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }
    /**
     * implements play 
     */
    public String play() {
        return album.nextSong();
    }
    /**
     * implements rewind
     */
    public String rewind() {
        return album.prevSong();
    }
    /**
     * implements fast forward
     */
    public String ffwd() {
        return album.nextSong();
    }
    /**
     * implements pause
     */
    public String pause() {
        return album.pause();
    }
    /**
     * implements stop
     */
    public String stopEject() {
        return album.stop();
    }
}
