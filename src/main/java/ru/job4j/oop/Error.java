package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error firstError = new Error();
        firstError.print();
        Error secondError = new Error(true, 100500, "Вышла ошибочка...");
        secondError.print();
        Error thirdError = new Error(false, 0, "Ошибок нет");
        thirdError.print();
        Error fourthError = new Error(true, 404, "Страница не найдена!");
        fourthError.print();
    }

}
