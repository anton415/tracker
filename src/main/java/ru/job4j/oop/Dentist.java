package ru.job4j.oop;

public class Dentist extends Doctor {
    private String speciality;
    private String salary;

    public Dentist(String name, String surname, String education, String birthday,
                   String speciality, String salary) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getSalary() {
        return salary;
    }
}
