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
        float euro = Converter.rubleToEuro(5000);
        float dollar = Converter.rubleToDollar(5000);
        System.out.printf("5000 rubles are " + "%.2f" + " euro.\n", euro);
        System.out.printf("5000 rubles are " + "%.2f" + " dollar.\n", dollar);
    }
}
