package section4;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than 1. Shutting game down");
            System.exit(0);
        }
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be more than 6. Shutting game down");
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers);

        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats! You win");
        } else {
            System.out.println("Sorry! you lose");
        }

        scan.close();
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
        return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);

    }
}