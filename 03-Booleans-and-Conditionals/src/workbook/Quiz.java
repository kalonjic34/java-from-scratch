package io.github.jiangdequan;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = 0;
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String q1 = scan.nextLine();
        if (q1.equals("c")) {
            points += 5;
        }

        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String q2 = scan.nextLine();
        if (q2.equals("a")) {
            points += 5;
        }

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String q3 = scan.nextLine();
        if (q3.equals("d")) {
            points += 5;
        }

        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        String q4 = scan.nextLine();
        if (q4.equals("a")) {
            points += 5;
        }

        System.out.println("Your final score is: " + points + "/20");
        if (points >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (points < 15 && points >= 5) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time");
        }
    }
}