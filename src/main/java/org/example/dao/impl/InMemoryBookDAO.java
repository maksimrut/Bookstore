package org.example.dao.impl;

import org.example.dao.BookDAO;
import org.example.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookDAO implements BookDAO {
    private final Map<Integer, Book> bookStore = new HashMap<>();
    private int lastId = 0;

    @Override
    public Book findById(int id) {
        return bookStore.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(bookStore.values());
    }

    @Override
    public void save(Book book) {
        book.setId(lastId);
        bookStore.put(lastId, book);
        lastId = lastId + 1;
    }

    @Override
    public void update(Book book) {
        int bookId = book.getId();

        if (bookStore.containsKey(bookId)) {
            bookStore.put(bookId, book);
        } else {
            // TODO: 14.10.2023 return Exception
        }

    }

    @Override
    public void delete(int id) {
        bookStore.remove(id);
    }

}
