package extrawork;

public class JavaClassroomSeating {
    public static void main(String[] args) {
        int[] scores = { generateScoreNumber(), generateScoreNumber(), generateScoreNumber(), generateScoreNumber(),
                generateScoreNumber() };

        int highestScoreSeat = 1;
        int highestScore = 0;
        System.out.print("Student scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                i = highestScoreSeat;
            }
        }
        System.out.println("\n\nThe highest score, " + highestScore + " is at seat " + highestScoreSeat);
    }

    public static int generateScoreNumber() {
        double randomNumber = Math.random() * 100;
        randomNumber += 1;
        return (int) randomNumber;
    }
}