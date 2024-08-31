package workbook;

import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok\n");

        System.out.print("1. Pick a number to count by: ");
        int countBy = scan.nextInt();
        scan.nextLine();

        System.out.print("2. Pick a number to start counting from: ");
        int countFrom = scan.nextInt();
        scan.nextLine();

        System.out.print("3. Pick a number to count to: ");
        int countTo = scan.nextInt();

        scan.close();
        for (int i = countFrom; i <= countTo; i += countBy) {
            System.out.print(i + " ");
        }
    }
}