package extrawork;

import java.util.Arrays;

public class JavaProductInventoryUpdate {
    public static void main(String[] args) {
        double[] productPrices = { 5.99, 7.49, 3.29, 6.79, 4.99 };
        double[] updatedPrices = new double[productPrices.length];

        for (int i = 0; i < productPrices.length; i++) {
            updatedPrices[i] = productPrices[i] * 1.8;
        }
        System.out.println(Arrays.toString(productPrices));
        System.out.println(Arrays.toString(updatedPrices));
    }
}