package workbook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Chris", "Dutch", "04/15/2000", 8);

        person.chooseSeat();
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println("Name: " + person.getName());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Seat Number: " + person.getSeatNumber());
        System.out.println("Passport: " + Arrays.toString(person.getPassport()) + "\n");

    }
}