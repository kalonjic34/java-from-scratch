package workbook;

import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int topping = scan.nextInt();
        scan.nextLine();
        String[] toppings = new String[topping];
        System.out.println("Great, enter each toppings!");

        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("\nThank you! Here are the toppings you ordered");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }
        scan.close();
    }
}