package io.github.jiangdequan;

public class AskJava {
    public static void main(String[] args) {
        System.out.println("Hi Java, do i have enough change to buy chips?");
        double change = 3.50;
        double price = 2.50;
        System.out.println("Java: " + (change >= price) + " \n");

        System.out.println("Hi Java, can the elevator hold everyone?");
        int people = 12;
        int capacity = 9;
        System.out.println("Java: " + (people >= capacity) + " \n");

        System.out.println("Hi Java, will my friend be happy?");
        String gift1 = "Mac Pro";
        String gift2 = "PS5";
        System.out.println("Java: " + gift1.equals(gift2) + " \n");

        System.out.println("Hi Java, can everyone attend my dinner party?");
        int partyCapacity = 50;
        int attendence = 35;
        System.out.println("Java: " + (partyCapacity >= attendence) + " \n");
    }
}