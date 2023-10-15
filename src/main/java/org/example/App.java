package org.example;

import org.example.api.BookStore;
import org.example.dao.BookDAO;
import org.example.dao.impl.InMemoryBookDAO;
import org.example.model.Book;
import org.example.service.BookService;
import org.example.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookDAO bookDAO = new InMemoryBookDAO();
        BookService serviceBook = new BookServiceImpl(bookDAO);
        BookStore bookStore = new BookStore(serviceBook);

        Book book1 = new Book("To Kill a Mockingbird", 12.99, 5);
        Book book2 = new Book("1984", 9.99, 8);
        Book book3 = new Book("The Great Gatsby", 14.99, 3);
        Book book4 = new Book("Pride and Prejudice", 11.99, 7);
        Book book5 = new Book("The Catcher in the Rye", 10.99, 6);
        Book book6 = new Book("The Hobbit", 15.99, 4);
        Book book7 = new Book("To Kill a Mockingbird", 12.99, 5);
        Book book8 = new Book("War and Peace", 16.99, 2);
        Book book9 = new Book("The Lord of the Rings", 19.99, 9);
        Book book10 = new Book("The Alchemist", 13.99, 10);

        bookDAO.save(book1);
        bookDAO.save(book2);
        bookDAO.save(book3);
        bookDAO.save(book4);
        bookDAO.save(book5);
        bookDAO.save(book6);
        bookDAO.save(book7);
        bookDAO.save(book8);
        bookDAO.save(book9);
        bookDAO.save(book10);

        bookStore.start();
    }
}
