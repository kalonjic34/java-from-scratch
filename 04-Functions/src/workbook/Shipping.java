package io.github.jiangdequan;

public class Shipping {
    /*
     * Exercise 2: Compute a Shipping Fee
     * 
     * Task - Write a Java function that computes the shipping fee based on the
     * weight of a package. The fee is $5 for packages weighing less than 5 pounds
     * and $10 for packages weighing 5 pounds or more.
     * 
     * Function Name: computeShippingFee
     * Parameters: The function takes one parameter named packageWeight of type
     * double.
     * 
     * Inside the Function:
     * 
     * Check if the packageWeight is less than 5 pounds. If true, assign a shipping
     * fee of $5, otherwise $10.
     * Print: The shipping fee for your package weighing <packageWeight> pounds is:
     * $<shippingFee>
     * Call the function from main() and test it with package weights of 3 pounds
     * and 6 pounds.
     */
    public static void main(String[] args) {
        computeShippingFee(3);
        computeShippingFee(6);
    }

    public static void computeShippingFee(double packageWeight) {
        /*
         * if (packageWeight < 5) {
         * System.out.println("This shipping fee for your package weighing " +
         * packageWeight + " pounds is: $5");
         * } else if (packageWeight >= 5) {
         * System.out.println("This shipping fee for your package weighing " +
         * packageWeight + " pounds is: $10");
         * }
         */

        double shippingFee = (packageWeight < 5) ? 5 : 10;
        System.out
                .println("The shipping fee for your package weighing " + packageWeight + " pounds is: $" + shippingFee);
    }
}