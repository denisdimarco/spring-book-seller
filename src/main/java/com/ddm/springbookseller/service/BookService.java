package com.ddm.springbookseller.service;

import com.ddm.springbookseller.model.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
