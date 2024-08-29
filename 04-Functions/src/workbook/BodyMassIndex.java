package workbook;

public class BodyMassIndex {
    /*
     * Task - Create a Java program that calculates the Body Mass Index (BMI) based
     * on a person's weight in kilograms and height in meters.
     */
    public static void main(String[] args) {
        double person1 = calculateBMI(70, 1.75);
        double person2 = calculateBMI(40, 1.45);
        double person3 = calculateBMI(55, 1.35);
        printBMIstatus(person2);
    }

    public static double calculateBMI(double weightkg, double heightM) {
        double bmi = weightkg / heightM * 2;
        return bmi;
    }

    public static void printBMIstatus(double bmi) {
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 >= bmi || bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 || bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }

    }
}