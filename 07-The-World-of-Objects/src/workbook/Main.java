package workbook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Chris", "Dutch", "04/15/2000", 8);

        System.out.println("Name: " + person.name);
        System.out.println("Nationality: " + person.nationality);
        System.out.println("Date of Birth: " + person.dateOfBirth);
        System.out.println("Seat Number: " + person.seatNumber);

    }
}