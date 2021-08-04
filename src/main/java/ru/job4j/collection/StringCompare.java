package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();
        int result;

        for (int i = 0; i < leftChars.length; i++) {
            for (int j = 0; j < rightChars.length; j++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result == 0) {
                    break;
                } else {
                    return result;
                }
            }
        }
        return Integer.compare(leftChars.length, rightChars.length);
    }
}