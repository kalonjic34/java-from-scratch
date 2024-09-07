package extrawork;

public class JavaExamScoresAnalysis {
    public static void main(String[] args) {
        int[] examScores = { 85, 92, 78, 95, 87, 90, 83, 88, 91, 89 };
        int aboveNinetyCount = 0;
        int eightyToEightyNineCount = 0;
        int belowEightyCount = 0;

        for (int i = 0; i < examScores.length; i++) {
            if (examScores[i] >= 90) {
                aboveNinetyCount++;
            } else if (examScores[i] > 80 && examScores[i] <= 89) {
                eightyToEightyNineCount++;
            } else if (examScores[i] < 80) {
                belowEightyCount++;
            }
        }
        System.out.println("Students that got an A: " + aboveNinetyCount);
        System.out.println("Students that got an B: " + eightyToEightyNineCount);
        System.out.println("Students that got an C: " + belowEightyCount);
    }
}