package extrawork;

public class JavaGrocer {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Banana", "Orange", "Grape", "Mango" };
        System.out.println("Do you sell orange?");

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("Orange")) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }
}