package ru.job4j.tracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemTest {
    List<Item> items = new ArrayList<>();

    @Before
    public void before() {
        items.add(new Item("Abc"));
        items.add(new Item("zxcf"));
        items.add(new Item(""));
        items.add(new Item("123"));
        items.add(new Item("abc"));
    }

    @Test
    public void whenSortUp() {
        Collections.sort(items, new SortItem());
        System.out.println(items);
    }

    @Test
    public void whenSortDown() {
        Collections.sort(items, new ReversedItem());
        System.out.println(items);
    }

}