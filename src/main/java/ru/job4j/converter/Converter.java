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
        float outForEuro = Converter.rubleToEuro(inForEuro);
        float outForDollar = Converter.rubleToDollar(inForDollar);
        boolean passedEuro = expectedForEuro == outForEuro;
        boolean passedDollar = expectedForDollar == outForDollar;
        System.out.println("420 rubles are " + outForEuro + " euro. Test result : " + passedEuro);
        System.out.printf("420 rubles are " + outForDollar + " dollar. Test result : " + passedDollar);
    }
}
