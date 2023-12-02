package Task04;

import java.text.DecimalFormat;

public class Calculate {

    public static double getTariff (double weight){

        if (weight <= Main.MINWEIGHT) {
            return Main.MINTARIFF;
        } else if (weight > Main.MINWEIGHT && weight <= Main.MAXWEIGHT) {
            return Main.AVGTARIFF;
        } else {
            return Main.MAXTARIFF;
        }
    }

    public static void getOutput() {

        String roundWight = roundValue(Main.weight);
        String rountClientTariff = roundValue(Main.clientTariff);

        System.out.println("Baggage weight: kg " + roundWight +
                "\nPayment according to the tariff: " + Main.CURRENCY + " " + rountClientTariff);
    }

    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }
}
