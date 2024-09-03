package workbook;

public class Exam {
    public static void main(String[] args) {
        // String[] seats = { "Harry", "Neville", "Ron", "Hermione", "Seamus" };
        String[] students = { "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean" };

        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", you will take a seat " + i);
        }

    }
}