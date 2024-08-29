package workbook;

public class Discount {
    /*
     * Exercise 1: Calculate a Discount
     * 
     * Task - Given a total bill amount, write a Java function that calculates a
     * discount of 20% on the bill and prints the discounted amount.
     * 
     * Function Name: calculateDiscount
     * Parameters: The function takes one parameter named totalBill of type double.
     * 
     * Inside the Function:
     * 
     * Calculate a discount that's 20% of the total bill amount.
     * Print: Congratulations! You have received a 20% discount. Your new bill
     * amount is: $<discountedAmount>
     * Call the function from main() and test it with a total bill amount of $100.
     */

    public static void main(String[] args) {
        calculateDiscount(100);
    }

    public static void calculateDiscount(double totalBill) {
        double discount = totalBill - (totalBill * 0.20);
        System.out.println("Congratulations! You have received a 20% discount. Your new bill amount is: $" + discount);
    }
}