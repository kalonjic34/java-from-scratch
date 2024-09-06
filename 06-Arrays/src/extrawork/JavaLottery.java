package extrawork;

public class JavaLottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = { generateLotteryNumber(), generateLotteryNumber(), generateLotteryNumber(),
                generateLotteryNumber(), generateLotteryNumber(), generateLotteryNumber() };

        int winningNumber = 0;
        System.out.print("Lottery number: ");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.print(lotteryNumbers[i] + " ");
            if (lotteryNumbers[i] > winningNumber) {
                winningNumber = lotteryNumbers[i];
            }
        }
        System.out.println("\n\nThe winning number is: " + winningNumber);

    }

    public static int generateLotteryNumber() {
        double randomNumber = Math.random() * 50;
        randomNumber += 1;
        return (int) randomNumber;
    }
}