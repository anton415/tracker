package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fio;             // ФИО
    private String group;           // группа
    private LocalDate date;     // дата поступления

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
