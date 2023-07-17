package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
//            if (i == input.length()) {
//                result = result + input.charAt(i);
//                System.out.println("ша"+input.charAt(i));
//            }
            if (input.charAt(i) == symbol) {
                counter = counter + 1;

            } else {

                result = result + symbol + counter;
                symbol = input.charAt(i);
                counter = 1;
            }


        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(encode("zzzzhhhooopppppka"));

    }
}
