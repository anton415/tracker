package ru.job4j.tracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    List<Item> items = new ArrayList<>();
    List<Item> itemsSort = new ArrayList<>();
    List<Item> itemsReversed = new ArrayList<>();

    @Before
    public void before() {
        initNotSortedList();
        initSortedList();
        initReversedList();
    }

    @Test
    public void whenSortUp() {
        Collections.sort(items, new SortItem());
        System.out.println(items);
        assertThat(items, is(itemsSort));
    }

    @Test
    public void whenSortDown() {
        Collections.sort(items, new ReversedItem());
        System.out.println(items);
    }

    private void initNotSortedList() {
        items.add(new Item("Abc"));
        items.add(new Item("zxcf"));
        items.add(new Item(""));
        items.add(new Item("123"));
        items.add(new Item("abc"));
    }

    private void initSortedList() {
        itemsSort.add(items.get(2));
        itemsSort.add(items.get(3));
        itemsSort.add(items.get(0));
        itemsSort.add(items.get(4));
        itemsSort.add(items.get(1));
    }

    private void initReversedList() {
        itemsReversed.add(items.get(1));
        itemsReversed.add(items.get(4));
        itemsReversed.add(items.get(0));
        itemsReversed.add(items.get(3));
        itemsReversed.add(items.get(2));
    }

}