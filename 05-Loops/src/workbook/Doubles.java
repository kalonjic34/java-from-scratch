package workbook;

public class Doubles {
    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }
        System.out.println("You rolled doubles!");
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

}