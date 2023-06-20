//Sophia Hostetler
//U27264415
//Song Driver

import java.util.Scanner;

public class SongDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
  //Prompt the user for the number of songs they’d like to enter in the playlist. 
        System.out.print("How many songs for this playlist? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        PlayList playList = new PlayList();

        for (int song = 1; song <= count; song++) {

            System.out.print("Enter metadata for song " + song + ":\n");
            System.out.print("Song Title: ");
            String title = scanner.nextLine();
            System.out.print("Artist: ");
            String artist = scanner.nextLine();
            System.out.print("Album: ");
            String album = scanner.nextLine();
            System.out.print("Track Number: ");
            int trackNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Year Released: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            playList.addSong(title, artist, album, trackNumber, year);
        }
//Output
        System.out.println(playList);
    }
}
