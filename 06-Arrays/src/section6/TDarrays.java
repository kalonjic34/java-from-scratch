package section6;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = {
                { 72, 74, 78, 76 },
                { 76, 65, 64, 67 },
                { 95, 98, 99, 100 }
        };
        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Harry: ");
                    break;
                case 1:
                    System.out.print("Ron: ");
                    break;
                case 2:
                    System.out.print("Hermione: ");
                    break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}