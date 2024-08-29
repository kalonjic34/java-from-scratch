package section4;

public class Weather {
    public static void main(String[] args) {
        printTempretures(77);
        printTempretures(61);
        printTempretures(55);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void printTempretures(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) + "\n");
    }
}