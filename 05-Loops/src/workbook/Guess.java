package workbook;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("I choose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();
        int secret = 3;

        while (guess != secret) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }
        scan.close();
    }
}