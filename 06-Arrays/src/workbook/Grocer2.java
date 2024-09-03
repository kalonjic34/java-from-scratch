package workbook;

import java.util.Scanner;

public class Grocer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can i help you find?\n");
        String item = scan.nextLine();
        String[] store = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

        for (int i = 0; i < store.length; i++) {
            if (item.equals(store[i]))
                System.out.println("\nWe have that in aisle: " + i);
        }
        scan.close();
    }
}