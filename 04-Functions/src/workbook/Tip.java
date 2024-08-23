package io.github.jiangdequan;

public class Tip {
    public static void main(String[] args) {
        tipTheWaiter(53.50);
    }

    public static void tipTheWaiter(double bill) {
        double tip = bill * 0.15;
        System.out.println("Thank you!");
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);

    }
}