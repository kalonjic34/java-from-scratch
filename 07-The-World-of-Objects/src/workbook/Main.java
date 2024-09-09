package workbook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Chris", "Dutch", "04/15/2000", 8);

        Person twin = new Person(person);
        twin.setName("Liam");
        twin.setSeatNumber(3);

        person.setSeatNumber(10);

        System.out.println("Name: " + person.getName());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Seat Number: " + person.getSeatNumber());

        System.out.println("Name: " + twin.getName());
        System.out.println("Nationality: " + twin.getNationality());
        System.out.println("Date of Birth: " + twin.getDateOfBirth());
        System.out.println("Seat Number: " + twin.getSeatNumber());

    }
}