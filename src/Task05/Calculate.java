package Task05;

public class Calculate {

    public static double getCalculate(double weight) {

        if (weight <= Main.minWeight) {
            return Main.minTariff;
        } else if (weight <= Main.maxWeight) {
            return Main.avgTariff;
        } else {
            return Main.maxTariff;
        }
    }
}
