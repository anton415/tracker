package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void whenSortUp() {
        List<Item> items = new ArrayList<>();
        List<Item> itemsSort = new ArrayList<>();
        items.add(new Item("Abc"));
        items.add(new Item("zxcf"));
        items.add(new Item(""));
        items.add(new Item("123"));
        items.add(new Item("abc"));
        itemsSort.add(items.get(2));
        itemsSort.add(items.get(3));
        itemsSort.add(items.get(0));
        itemsSort.add(items.get(4));
        itemsSort.add(items.get(1));
        Collections.sort(items, new SortItem());
        System.out.println(items);
        assertThat(items, is(itemsSort));
    }

    @Test
    public void whenSortDown() {
        List<Item> items = new ArrayList<>();
        List<Item> itemsReversed = new ArrayList<>();
        items.add(new Item("Abc"));
        items.add(new Item("zxcf"));
        items.add(new Item(""));
        items.add(new Item("123"));
        items.add(new Item("abc"));
        itemsReversed.add(items.get(1));
        itemsReversed.add(items.get(4));
        itemsReversed.add(items.get(0));
        itemsReversed.add(items.get(3));
        itemsReversed.add(items.get(2));
        Collections.sort(items, new ReversedItem());
        System.out.println(items);
    }
}