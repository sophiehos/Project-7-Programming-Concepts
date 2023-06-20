//Sophia Hostetler
//U27264415
// Song 

public class Song {
//private members
    private String title;
    private String artist;
    private String album;
    private int trackNumber;
    private int year;
//Modify the constructor so that it sets up a Song object 
    public Song(String title, String artist, String album, int trackNumber, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.trackNumber = trackNumber;
        this.year = year;
    }
//Modify the toString so that it displays the contents of the Song object
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%5d%7d", title, artist,
                album, trackNumber, year);

    }
}