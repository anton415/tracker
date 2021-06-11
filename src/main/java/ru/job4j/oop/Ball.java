package ru.job4j.oop;

public class Ball {
    public void tryEat(Ball ball) {
        if (this == ball) {
            System.out.println("Я " + ball + ", не буду кушать себя!");
        } else {
            System.out.println("Я съем тебя, " + ball);
        }

    }
}
