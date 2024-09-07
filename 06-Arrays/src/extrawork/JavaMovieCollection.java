package extrawork;

public class JavaMovieCollection {
    public static void main(String[] args) {
        String[] bookNames = { "The Great Gatsby", "To Kill a Mockingbird", "1984", "Pride and Prejudice",
                "The Catcher in the Rye" };
        double[] bookPrice = { 12.99, 9.99, 14.99, 10.99, 11.49 };
        for (int i = 0; i < bookNames.length; i++) {
            System.out.println(bookNames[i] + ": $" + bookPrice[i]);
        }
    }
}