package ru.job4j.strategy;

public class Square implements Shape{
    @Override
    public String draw() {
        return "Square";
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}
