package ru.job4j.collection;

import java.util.Comparator;

// по убыванию имени
public class JobDescByNameDown implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}