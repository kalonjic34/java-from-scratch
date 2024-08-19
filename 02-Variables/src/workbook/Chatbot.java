package io.github.jiangdequan;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        System.out.println("Hi " + name + ",. I am Javabot. Where are you from?");
        String location = scan.nextLine();

        System.out.println("I hear it's beautiful at " + location + "! I'm from a place called Oracle");
        System.out.println("How old are you?");

        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("So you are " + age + ", cool! I'm 400 years old");
        System.out.println("This means I'm " + 400 / age + " times older than you.");
        System.out.println("Enough about me. What is your favourite language? (just don't say python)");

        String fav_code_language = scan.nextLine();
        scan.close();
        System.out.println(fav_code_language + ", that's great! Nice chatting with you " + name
                + " I have to log off now. See ya!");
    }
}