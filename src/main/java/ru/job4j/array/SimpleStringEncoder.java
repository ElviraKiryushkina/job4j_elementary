package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        String count = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter ++;
                count = "" + counter;
            } else {
                result = result + "" + symbol + count;
                symbol = input.charAt(i);
                counter = 1;
                count = "";
            }


        }
        result = result + symbol + count;
        return result;
    }


    public static void main(String[] args) {
        System.out.println(encode("zzzzhhhooopppppka"));

    }
}
