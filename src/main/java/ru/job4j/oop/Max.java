package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        int maxOfTwoNumber = Math.max(first, second);
        return Math.max(maxOfTwoNumber, third);
    }

    public static int max(int... n) {
        int max = n[0];
        for (int j : n) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
