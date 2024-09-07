package extrawork;

public class JavaMarathonRunnerStats {
    public static void main(String[] args) {
        String[] raceResults = { "1st", "3rd", "2nd", "5th", "1st", "4th", "3rd" };
        int firstPlaceCount = 0;
        int secondPlaceCount = 0;
        int thirdPlaceCount = 0;
        int fourthPlaceCount = 0;

        for (int i = 0; i < raceResults.length; i++) {
            if (raceResults[i].equals("1st")) {
                firstPlaceCount++;
            } else if (raceResults[i].equals("2nd")) {
                secondPlaceCount++;
            } else if (raceResults[i].equals("3rd")) {
                thirdPlaceCount++;
            } else if (raceResults[i].equals("4th")) {
                fourthPlaceCount++;
            }
        }
        System.out.println("There are " + firstPlaceCount + " first place wins");
        System.out.println("There are " + secondPlaceCount + " second place wins");
        System.out.println("There are " + thirdPlaceCount + " third place wins");
        System.out.println("There are " + fourthPlaceCount + " fourth place wins");
    }
}