package io.github.jiangdequan;

import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name: ");
        String fname = scan.nextLine();

        System.out.println("What is your last name?: ");
        String lname = scan.nextLine();

        System.out.println("You old are you?: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Make a username?: ");
        String username = scan.nextLine();

        System.out.println("What city do you live in?: ");
        String city = scan.nextLine();

        System.out.println("What country is that?: ");
        String country = scan.nextLine();

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entred: ");
        System.out.println("\tFirst Name: " + fname);
        System.out.println("\tLast Name: " + lname);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

    }
}