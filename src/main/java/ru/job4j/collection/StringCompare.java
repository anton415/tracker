package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        if (left.equals(right)) {
            return 0;
        }
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            int result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                return result;
            }
        }
        return -1;
    }
}