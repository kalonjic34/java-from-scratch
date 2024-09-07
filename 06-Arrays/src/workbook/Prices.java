package workbook;

public class Prices {
    public static void main(String[] args) {
        double[][] price = new double[3][5];
        price[0][0] = 12.99;
        price[0][1] = 8.99;
        price[0][2] = 9.99;
        price[0][3] = 10.49;
        price[0][4] = 11.99;

        price[1][0] = 0.99;
        price[1][1] = 1.99;
        price[1][2] = 2.49;
        price[1][3] = 1.49;
        price[1][4] = 2.99;

        price[2][0] = 8.99;
        price[2][1] = 7.99;
        price[2][2] = 9.49;
        price[2][3] = 9.99;
        price[2][4] = 10.99;

        System.out.println(
                "Baking: " + price[0][0] + " " + price[0][1] + " " + price[0][2] + " " + price[0][3] + " "
                        + price[0][4]);
        System.out.println(
                "Beverage: " + price[1][0] + " " + price[1][1] + " " + price[1][2] + " " + price[1][3] + " "
                        + price[1][4]);
        System.out.println(
                "Cereals: " + price[2][0] + " " + price[2][1] + " " + price[2][2] + " " + price[2][3] + " "
                        + price[2][4]);
    }
}