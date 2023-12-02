package Task01;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    static int quantity;
    static double weight;
    static double totalWeight;

    public static void main(String[] args) {

        quantity = 27;
        weight = 14.28;

        totalWeight = getTotalWeight(quantity, weight);
        getOutput();
    }

    public static double getTotalWeight(int qntity, double wght) {

        return qntity * wght;
    }

    public static void getOutput() {

        String roundTotalWeight = roundValue(totalWeight);
        String roundWeight = roundValue(weight);

        System.out.println("Quantity of products: " + quantity + " pcs" +
                "\nPcs weight of the products: " + roundWeight + " kg" +
                "\nTotal weight of the products: " + roundTotalWeight + " kg");
    }

    public static String roundValue(double value) {

        return new DecimalFormat("#.00").format(value);
    }

}
