package Task04;

public class Main {

    static double weight;
    static double clientTariff;
    final static double MIN_TARIFF = 19;
    final static double AVG_TARIFF = 32;
    final static double MAX_TARIFF = 47;
    final static double MIN_WEIGHT = 25;
    final static double MAX_WEIGHT = 50;
    final static String CURRENCY = "USD";

    public static void main(String[] args) {

        weight = 43;

        clientTariff = Calculate.getTariff(weight);
        Calculate.getOutput();
    }
}