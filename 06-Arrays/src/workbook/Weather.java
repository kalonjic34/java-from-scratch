package workbook;

import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTempreture(celsius, "Celsius");
        printTempreture(fahrenheit, "Fahrenheit");
    }

    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
        }
        return fahrenheit;

    }

    public static void printTempreture(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("\n");

    }

}