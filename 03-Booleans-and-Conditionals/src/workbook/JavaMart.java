package io.github.jiangdequan;

public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        System.out.println("Can you buy me this toy car?");
        double toyCar = 20.00;
        if (wallet >= toyCar) {
            System.out.println("Sure!");
        }
        wallet -= toyCar;
        System.out.println("$" + wallet + ": remaining");

        System.out.println("Can you buy me this new PlayStation5?");
        double PlayStation5 = 95.00;
        if (wallet >= PlayStation5) {
            System.out.println("Sure!");
        } else {
            System.out.println("Sorry, I only have $" + wallet + " left");
        }
    }
}