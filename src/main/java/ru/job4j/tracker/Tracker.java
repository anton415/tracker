package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * получение списка всех заявок
     * @return все заявки
     */
    public Item[] findAll() {
        return items;
    }

    /**
     * получение списка по имени
     * @param key имя
     * @return список заявок
     */
    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int rslIndex = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                rsl[rslIndex++] = items[index];
            }
        }
        return Arrays.copyOf(rsl, rslIndex);
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}