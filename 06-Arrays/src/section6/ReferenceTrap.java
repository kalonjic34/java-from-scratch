package section6;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Liam" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}