package extrawork;

import java.util.Scanner;

public class JavaMusicPlaylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number of songs you want on the playlist: ");
        int numOfSongs = scan.nextInt();
        scan.nextLine();
        String[] playlist = new String[numOfSongs];
        for (int i = 0; i < playlist.length; i++) {
            System.out.print(i + ". ");
            playlist[i] = scan.nextLine();
        }
        scan.close();
        System.out.println("\nHere is your playlist of your songs");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(i + ". " + playlist[i]);
        }
    }
}