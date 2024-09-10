package workbook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Chris", "Dutch", "04/15/2000", 8);
        person.chooseSeat();
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println(person);
    }
}