package ru.job4j.pojo;

public class Book {
    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
