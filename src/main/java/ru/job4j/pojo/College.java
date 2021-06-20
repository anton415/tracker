package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Anton");
        student.setGroup("123");
        student.setDate(LocalDate.of(2020, 9, 1));
        System.out.println("Student info: " +
                        student.getFio()
                        + " " +
                        student.getGroup()
                        + " " +
                        student.getDate()
                );
    }
}
