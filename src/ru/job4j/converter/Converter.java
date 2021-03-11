package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        double inDollar = 140;

        double euro = Converter.rubleToEuro(inEuro);
        double dollar = Converter.rubleToDollar(inDollar);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        //тесты

        int expectedEuro = 2;
        double expectedDollar = 2.3333333333333335;

        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles  are 2. Test result :" + passedEuro);

        double out2 = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == out2;
        System.out.println("140 rubles  are 2. Test result :" + passedDollar);
    }
}
