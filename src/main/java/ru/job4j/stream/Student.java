package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private int score;
    private String name;
    private String account;
    private String group;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    public Student(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(name, student.name)
                && Objects.equals(account, student.account)
                && Objects.equals(group, student.group)
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name, account, group, surname);
    }
}