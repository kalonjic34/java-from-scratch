package io.github.jiangdequan;

public class LengthUnits {
    /*
     * Task - Write a Java program that converts lengths from inches to centimeters.
     */
    public static void main(String[] args) {
        printLengths(10);
        printLengths(20);
        printLengths(30);
    }

    public static double inchesToCentimeters(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static void printLengths(double inches) {
        System.out.println("Length in inches: " + inches + " inches");
        System.out.println("Length in centimeters: " + inchesToCentimeters(inches) + "\n");
    }
}