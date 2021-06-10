package ru.job4j.oop;

public class Student {
    /**
     * сыграть на баяне
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * спеть
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
    }
}
