package org.example.service.impl;

import org.example.dao.BookDAO;
import org.example.model.Book;
import org.example.service.BookService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {
    private final BookDAO bookDAO;

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public List<Book> findAllSortedById() {
        List<Book> bookList = bookDAO.findAll();
        List<Book> sortedBookList = bookList.stream()
                .sorted(Comparator.comparing(Book::getId))
                .collect(Collectors.toList());
        return sortedBookList;
    }

    @Override
    public List<Book> findAllSortedByName() {
        List<Book> bookList = bookDAO.findAll();
        List<Book> sortedBookList = bookList.stream()
                .sorted(Comparator.comparing(Book::getName))
                .collect(Collectors.toList());
        return sortedBookList;
    }

    @Override
    public List<Book> findAllSortedByPrice() {
        List<Book> bookList = bookDAO.findAll();
        List<Book> sortedBookList = bookList.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
        return sortedBookList;
    }

    @Override
    public List<Book> findAllSortedByAvailability() {
        List<Book> bookList = bookDAO.findAll();
        List<Book> sortedBookList = bookList.stream()
                .sorted(Comparator.comparing(Book::getAvailability))
                .collect(Collectors.toList());
        return sortedBookList;
    }

    @Override
    public void save(Book book) {
        bookDAO.save(book);
    }

    @Override
    public void update(Book book) {
        bookDAO.update(book);

    }

    @Override
    public void delete(int id) {
        bookDAO.delete(id);
    }
}
