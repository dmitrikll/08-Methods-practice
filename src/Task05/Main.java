package Task05;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main {

    static double weight;
    static double payTariff;
    static double minTariff;
    static double avgTariff;
    static double maxTariff;
    static double minWeight;
    static double maxWeight;
    final static String CURRENCY = "USD";
    final static String MEASURE = "kg";

    public static void main(String[] args) {

        minWeight = getMinWeight();
        maxWeight = getMaxWeight();
        minTariff = getMinTariff();
        avgTariff = getAvgTariff();
        maxTariff = getMaxTariff();
        weight = getWeight();
        payTariff = Calculate.getCalculate(weight);
        getOutput();
    }

    public static double getWeight() {

        System.out.print("Enter baggage weight (" + MEASURE + "): ");
        Scanner scWeight = new Scanner(System.in);
        scWeight.useLocale(Locale.ENGLISH);
        return scWeight.nextDouble();
    }

    public static double getMinWeight() {

        System.out.print("Enter min weight (" + MEASURE + "): ");
        Scanner scMinWeight = new Scanner(System.in);
        scMinWeight.useLocale(Locale.ENGLISH);
        return scMinWeight.nextDouble();
    }

    public static double getMaxWeight() {

        System.out.print("Enter max weight (" + MEASURE + "): ");
        Scanner scMaxWeight = new Scanner(System.in);
        scMaxWeight.useLocale(Locale.ENGLISH);
        return scMaxWeight.nextDouble();
    }

    public static double getMinTariff() {

        System.out.print("Enter min tariff " + CURRENCY + ": ");
        Scanner scMinTariff = new Scanner(System.in);
        scMinTariff.useLocale(Locale.ENGLISH);
        return scMinTariff.nextDouble();
    }

    public static double getAvgTariff() {

        System.out.print("Enter avg tariff " + CURRENCY + ": ");
        Scanner scAvgTariff = new Scanner(System.in);
        scAvgTariff.useLocale(Locale.ENGLISH);
        return scAvgTariff.nextDouble();
    }

    public static double getMaxTariff() {

        System.out.print("Enter max tariff " + CURRENCY + ": ");
        Scanner scMaxTariff = new Scanner(System.in);
        scMaxTariff.useLocale(Locale.ENGLISH);
        return scMaxTariff.nextDouble();
    }

    public static void getOutput() {

        String roundMinWeight = roundValue(minWeight);
        String roundMaxWeight = roundValue(maxWeight);
        String roundMinTariff = roundValue(minTariff);
        String roundAvgTariff = roundValue(avgTariff);
        String roundMaxTariff = roundValue(maxTariff);
        String roundWeight = roundValue(weight);
        String roundPayTariff = roundValue(payTariff);

        System.out.println("\nTariff for weight up to " + roundMinWeight + MEASURE + " (inclusive): " + CURRENCY + " " + roundMinTariff +
                "\nTariff for weight from " + roundMinWeight + MEASURE + " to " + roundMaxWeight + MEASURE + " (inclusive): " + CURRENCY + " " + roundAvgTariff +
                "\nTariff for weight over " + roundMaxWeight + MEASURE + ": " + CURRENCY + " " + roundMaxTariff +
                "\n\nBaggage weight: " + roundWeight + MEASURE +
                "\nThe cost of transportation: " + CURRENCY + " " + roundPayTariff);

    }

    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
