package workbook;

public class Receipt {
    public static void main(String[] args) {
        String[] apples = { "Gala", "Granny Smith", "Macintosh" };
        double[] applePrice = { 1.99, 1.49, 1.29 };
        System.out.println("Here's your receipts\n");
        for (int i = 0; i < apples.length; i++) {
            System.out.println("\t" + apples[i] + ": $" + applePrice[i]);
        }

    }
}