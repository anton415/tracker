package ru.job4j.oop;

public class Programmer extends Engineer {
    private String language;
    private int salary;
    private String computer;

    public Programmer(String name, String surname, String education, String birthday,
                      String language, int salary, String computer) {
        super(name, surname, education, birthday);
        this.language = language;
        this.salary = salary;
        this.computer = computer;
    }

    public String getLanguage() {
        return language;
    }

    public int getSalary() {
        return salary;
    }

    public String getComputer() {
        return computer;
    }
}
