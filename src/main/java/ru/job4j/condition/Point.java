package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.printf("Distance from (0, 0) to (2, 0) is " + "%.2f \n", result1);
        double result2 = Point.distance(1, 2, 0, 0);
        System.out.printf("Distance from (1, 2) to (0, 0) is " + "%.2f \n", result2);
        double result3 = Point.distance(1, 2, 3, 4);
        System.out.printf("Distance from (1, 2) to (3, 4) is " + "%.2f \n", result3);
    }
}
