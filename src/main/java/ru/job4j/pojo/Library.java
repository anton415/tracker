package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        // Создание книг
        Book cleanCode = new Book("Clean code", 123);
        Book potter = new Book("Harry Potter", 321);
        Book phoneNumbers = new Book("Phone numbers", 50);
        Book fun = new Book("Just for fun", 100);
        // Добавление книг в массив
        Book[] books = {cleanCode, potter, phoneNumbers, fun};
        // Вывод содержание массива
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i].getName() + " " + books[i].getPageNumber());
        }
        // Перестановка местами книги с индексом 0 и 3
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        // Вывод содержание массива
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i].getName() + " " + books[i].getPageNumber());
        }
        // Вывод книг с именем "Clean code"
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println("Book: " + book.getName() + " " + book.getPageNumber());
            }
        }
    }
}
