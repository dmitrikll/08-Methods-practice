package Task04;

import java.text.DecimalFormat;

public class Calculate {

    public static double getTariff(double weight) {

        if (weight <= Main.MIN_WEIGHT) {
            return Main.MIN_TARIFF;
        } else if (weight > Main.MIN_WEIGHT && weight <= Main.MAX_WEIGHT) {
            return Main.AVG_TARIFF;
        } else {
            return Main.MAX_TARIFF;
        }
    }

    public static void getOutput() {

        String roundWight = roundValue(Main.weight);
        String roundClientTariff = roundValue(Main.clientTariff);

        System.out.println("Baggage weight: kg " + roundWight +
                "\nPayment according to the tariff: " + Main.CURRENCY + " " + roundClientTariff);
    }

    public static String roundValue(double value) {

        return new DecimalFormat("#.00").format(value);
    }
}
