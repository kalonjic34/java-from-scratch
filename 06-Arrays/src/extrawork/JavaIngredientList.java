package extrawork;

import java.util.Scanner;

public class JavaIngredientList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of ingredients you want on the list");
        int numingredients = scan.nextInt();
        scan.nextLine();
        String[] ingredients = new String[numingredients];

        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(i + ". ");
            ingredients[i] = scan.nextLine();
        }
        System.out.println("\nHere are the ingredients you have picked");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(i + ". " + ingredients[i]);
        }
    }
}