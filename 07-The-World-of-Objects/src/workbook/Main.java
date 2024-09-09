package workbook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person chris = new Person();
        chris.name = "Chris";
        chris.nationality = "Dutch";
        chris.dateOfBirth = "04/15/2000";
        chris.passport = new String[] {
                chris.name,
                chris.nationality,
                chris.dateOfBirth,
        };
        chris.seatNumber = 8;

        System.out.println(chris.name);
        System.out.println(chris.nationality);
        System.out.println(chris.dateOfBirth);
        System.out.println(Arrays.toString(chris.passport));
        System.out.println(chris.seatNumber);
    }
}