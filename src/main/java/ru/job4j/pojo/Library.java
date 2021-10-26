package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 123);
        Book potter = new Book("Harry Potter", 321);
        Book phoneNumbers = new Book("Phone numbers", 50);
        Book fun = new Book("Just for fun", 100);
        Book[] books = {cleanCode, potter, phoneNumbers, fun};
        for (Book value : books) {
            System.out.println("Book: " + value.getName() + " " + value.getPageNumber());
        }
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (Book value : books) {
            System.out.println("Book: " + value.getName() + " " + value.getPageNumber());
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book: " + book.getName() + " " + book.getPageNumber());
            }
        }
    }
}
