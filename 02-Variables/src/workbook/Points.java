package io.github.jiangdequan;

public class Points {
    public static void main(String[] args) {
        int points = 0;
        System.out.println("Harry eas caught wandering the halls. -50 points for Gryffindor");
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -= 3;
        System.out.println("harmione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;
        System.out.println("Total points: " + points + "\n");

        // Exercise 1: "The Hero's Journey"

        int health = 100;
        health -= 20; // attack
        health -= 20; // attack
        health += 15; // heal
        health -= 20; // attack

        System.out.println("Health points: " + health + "\n");

        // Exercise 2: "The Treasure Hunt"

        int tresure = 200;

        tresure += 30; // Find a hidden stash
        tresure -= 15; // Lose some coins
        tresure += 20; // Discover a secret passage

        System.out.println("Tresure: " + tresure);
    }
}