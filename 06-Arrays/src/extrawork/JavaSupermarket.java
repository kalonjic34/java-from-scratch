package extrawork;

import java.util.Scanner;

public class JavaSupermarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Supermarket.");
        System.out.println("What are you looking for today?\n");
        String item = scan.nextLine();
        String[] store = { "milk", "bread", "eggs", "cheese", "butter", "yogurt" };
        for (int i = 0; i < store.length; i++) {
            if (item.equals(store[i])) {
                System.out.println("We have that in aisle: " + i);
            }
        }
        scan.close();
    }
}