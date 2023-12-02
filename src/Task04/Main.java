package Task04;

public class Main {

    static double weight;
    static double clientTariff;
    final static double MINTARIFF = 19;
    final static double AVGTARIFF = 32;
    final static double MAXTARIFF = 47;
    final static double MINWEIGHT = 25;
    final static double MAXWEIGHT = 50;
    final static String CURRENCY = "USD";

    public static void main(String[] args) {

        weight = 43;

        clientTariff = Calculate.getTariff(weight);
        Calculate.getOutput();
    }
}