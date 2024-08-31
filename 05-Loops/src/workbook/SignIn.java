package workbook;

import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to JavaGram! Sign in below\n");

        String myUsername = "th3b1ue0range";
        String myPassword = "123qwe";

        System.out.print(". Username: ");
        String username = scan.nextLine();
        System.out.print(". Password: ");
        String password = scan.nextLine();

        while (!username.equals(myUsername) && !password.equals(myPassword)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print(". Username: ");
            username = scan.nextLine();
            System.out.print(". Password: ");
            password = scan.nextLine();
        }

    }
}