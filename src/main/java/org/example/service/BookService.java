package org.example.service;

import org.example.model.Book;

import java.util.List;

public interface BookService {
    Book findById(int id);
    List<Book> findAll();
    List<Book> findAllSortedById();
    List<Book> findAllSortedByName();
    List<Book> findAllSortedByPrice();
    List<Book> findAllSortedByAvailability();
    void save(Book book);
    void update(Book book);
    void delete(int id);
}
