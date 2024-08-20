package io.github.jiangdequan;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String option = scan.nextLine();
        if (option.equals("yes")) {
            System.out.println("\nGreat! In one line");
            System.out.println("How much money do you have in your savings?");
            System.out.println("And, how much do you owe in credit card debt?");

            int savings = scan.nextInt();
            int creditDebt = scan.nextInt();

            System.out.println("How man years have you worked for?");
            int years = scan.nextInt();
            scan.nextLine();

            System.out.println("What is your name?");
            String name = scan.nextLine();

            if (savings >= 10000 && creditDebt < 5000 && years > 2) {
                System.out.println("Congratulations " + name + ", you have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        } else {
            System.out.println("\nOk. Have a nice day!");
        }
    }
}