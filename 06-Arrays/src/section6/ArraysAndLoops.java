package section6;

public class ArraysAndLoops {
    public static void main(String[] args) {
        String[] kingdoms = { "Mercia", "Wessex", "Norththubria", "E A" };

        for (int i = 0; i < kingdoms.length; i++) {
            System.out.println("The element at " + i + " is " + kingdoms[i]);
        }
    }
}