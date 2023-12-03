package Task03;

import java.text.DecimalFormat;

public class Main {

    static double[] productCost;
    static double totalCost;
    static double averageCost;
    final static String CURRENCY = "USD";

    public static void main(String[] args) {

        productCost = new double[]{14.75, 23.15, 32.12, 54.01, 11.23, 76.23, 43.28, 22.11, 62.70, 93.45};

        totalCost = getTotalCost(productCost);
        averageCost = getAverageCost(productCost);
        getOutput();
    }

    public static double getTotalCost(double... prices){

        double sum = 0;

        for (double price:prices) {
            sum +=price;
        }

        return sum;
    }

    public static double getAverageCost(double... prices){

        double sum = 0;

        for (double price:prices) {
            sum += price;
        }

        return sum / prices.length;
    }

    public static void getOutput() {

        String roundTotalCost = roundValue(totalCost);
        String roundAverageCost = roundValue(averageCost);

        System.out.println("Total cost of deliveries: " + CURRENCY + " " + roundTotalCost +
                "\nAverage cost of delivery: " + CURRENCY + " " + roundAverageCost);
    }

    public static String roundValue(double value) {

        return new DecimalFormat("#.00").format(value);
    }
}
