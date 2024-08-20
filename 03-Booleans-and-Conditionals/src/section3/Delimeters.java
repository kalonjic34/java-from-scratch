package io.github.jiangdequan;

import java.util.Scanner;

public class Delimeters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
         * System.out.println("Enter two integers (on the same line)");
         * String numbers = scan.nextLine();
         * 
         * System.out.println("Enter two very big integers (on the same line)");
         * String bigNumbers = scan.nextLine();
         * 
         * System.out.println("Enter two decimals (on the same line)");
         * String decimals = scan.nextLine();
         * 
         * System.out.println("Enter two text (on the same line)");
         * String text = scan.nextLine();
         * scan.close();
         * System.out.println("\tIntegers: " + numbers);
         * System.out.println("\tBig integers: " + bigNumbers);
         * System.out.println("\tDecimals: " + decimals);
         * System.out.println("\tWords: " + text);
         */

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        scan.nextLine();
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();
        scan.close();
    }
}