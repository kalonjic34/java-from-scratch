package workbook;

public class HighScore {
    public static void main(String[] args) {
        int scores[] = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };
        System.out.print("Here are the scores: ");
        int highScore = 0;
        int seat = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }

        }
        System.out.println("\n\nThe highest score is: " + highScore + " Impressive!");
        System.out.println("\n\nIt's the gentleman in seat: " + seat + ". Give that man a cookie!");

    }

    public static int randomNumber() {
        double randomNum = Math.random() * 49999;
        randomNum += 1;
        return (int) randomNum;
    }
}