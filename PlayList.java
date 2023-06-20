//Sophia Hostetler
//U27264415
//Play List

public class PlayList {

    private Song[] songs;
    private int counter;

 // Constructor
    public PlayList() {
        songs = new Song[3];
        counter = 0;
    }
//Adds a song to the collection, increasing the size of the
 // collection array if necessary.

    public void addSong(String title, String artist, String album, int trackNumber, int year) {
        Song aSong = new Song(title, artist, album, trackNumber, year);
        if (counter < songs.length) {
            songs[counter] = aSong;
            counter += 1;
        } else {
            increaseSize();
            songs[counter] = aSong;
            counter += 1;
        }

    }

    private void increaseSize() {

        Song[] temp = new Song[songs.length * 2];
        for (int song = 0; song < songs.length; song++) {
            temp[song] = songs[song];
        }
        songs = temp;
    }
// Returns a report describing the song collection
    @Override
    public String toString() {
        
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My Playlist \n\n";
        report += "Number of Songs: " + counter + "\n";
        for (int i = 0; i < counter; i++) {
            report += songs[i] + "\n";
        }
        return report;
    }
}