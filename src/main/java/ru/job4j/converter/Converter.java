package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inForEuro = 420;
        float inForDollar = 420;
        float expectedForEuro = 6;
        float expectedForDollar = 7;
        float outEuro = Converter.rubleToEuro(inForEuro);
        float outDollar = Converter.rubleToDollar(inForDollar);
        boolean passedEuro = expectedForEuro == outEuro;
        boolean passedDollar = expectedForDollar == outDollar;
        System.out.println("420 rubles are " + outEuro + " euro. Test result : " + passedEuro);
        System.out.printf("420 rubles are " + outDollar + " dollar. Test result : " + passedDollar);
    }
}
