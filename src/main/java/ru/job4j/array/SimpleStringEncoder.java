package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == symbol) {
                counter = counter + 1;
            } else {
                if (counter > 1) {
                    result = result + symbol + counter;
                } else {
                    result = result + symbol;
                }
                counter = 1;
            }
            if (i == input.length() - 1) {
                symbol = input.charAt(i);
                if (counter > 1) {
                    result = result + symbol + counter;
                } else {
                    result = result + symbol;
                }
            }
            symbol = input.charAt(i);
        }
        return result;
    }

}
