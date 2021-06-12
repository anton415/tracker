package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        int maxOfTwoNumber = max(first, second);
        return max(maxOfTwoNumber, third);
    }
    public static int max(int first, int second, int third, int four) {
        int maxOfTwoNumber = max(first, second);
        int maxOfThreeNumber = max(maxOfTwoNumber, third);
        return max(maxOfThreeNumber, four);
    }
}
