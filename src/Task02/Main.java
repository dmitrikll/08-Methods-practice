package Task02;

import java.text.DecimalFormat;

public class Main {

    static int quantity;
    static double weight;
    static double totalWeight;
    static double badPercentage;
    static double totalBadWeight;

    public static void main(String[] args) {

        quantity = 27;
        weight = 14.28;
        badPercentage = 5.67;

        totalWeight = getTotalWeight(quantity, weight);
        totalBadWeight = getTotalBadWeight(totalWeight, badPercentage);
        getOutput();
    }

    public static double getTotalWeight(int qnty, double wght) {

        return qnty * wght;
    }

    public static double getTotalBadWeight(double wght, double prcn) {

        return wght * prcn / 100;
    }

    public static void getOutput() {

        String roundTotalWeight = roundValue(totalWeight);
        String roundWeight = roundValue(weight);
        String roundBadPercentage = roundValue(badPercentage);
        String roundTotalBadWeight = roundValue(totalBadWeight);

        System.out.println("Quantity of products: " + quantity + " pcs" +
                "\nPcs weight of the products: " + roundWeight + " kg" +
                "\nTotal weight of the products: " + roundTotalWeight + " kg" +
                "\nPercentage of bad products: " + roundBadPercentage + " %" +
                "\nTotal weight of the bad products: " + roundTotalBadWeight + " kg");
    }

    public static String roundValue(double value) {

        return new DecimalFormat("#.00").format(value);
    }

}
