package extrawork;

public class JavaBookstore {
    public static void main(String[] args) {
        String[] movie_genre = { "Fiction", "Non-Fiction", "Mystery", "Science Fiction", "Romance", "Thriller" };
        // A customer is looking for a Science Fiction book.

        System.out.println("Do you have Science Fiction book?");
        for (int i = 0; i < movie_genre.length; i++) {
            if (movie_genre[i].equals("Science Fiction")) {
                System.out.println("\nWe have Science Fiction books in the genre section: " + i);
            }
        }
    }
}