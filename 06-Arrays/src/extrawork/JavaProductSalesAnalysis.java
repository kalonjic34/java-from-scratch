package extrawork;

public class JavaProductSalesAnalysis {
    public static void main(String[] args) {
        int[] salesRecord = { 450, 550, 620, 480, 700, 800, 750 };

        int totalSales = 0;
        int highestSalesMonth = 1;
        for (int i = 0; i < salesRecord.length; i++) {
            totalSales += salesRecord[i];
            if (salesRecord[i] > highestSalesMonth) {
                highestSalesMonth = salesRecord[i];
                highestSalesMonth = i;
            }
        }

        System.out.println("Total sales: " + totalSales);
        double avgSales = totalSales / salesRecord.length;
        System.out.println("Average sales: " + avgSales);
        System.out.println("The month with the highest sales figure: " + highestSalesMonth);
    }
}