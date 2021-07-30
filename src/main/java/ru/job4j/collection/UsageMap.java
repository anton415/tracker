package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> collection = new HashMap<>();
        collection.put("anton415@gmail.com", "Serdyuchenko Anton Nicolaevich");
        for (String key : collection.keySet()) {
            String value = collection.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
