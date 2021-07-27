package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origins = originText.split(" ");
        String[] duplicates = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String origin : origins) {
            check.add(origin);
        }
        for (String duplicate : duplicates) {
            if (!check.contains(duplicate)) {
                rsl = false;
            }
        }
        return rsl;
    }
}