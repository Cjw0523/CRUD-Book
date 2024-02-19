package com.example.crud.service;

import com.example.crud.dto.BookRequest;
import com.example.crud.model.Book;

public interface BookService {

    Book getBookById(Integer bookId);

    Integer createBook(BookRequest bookRequest);

    void updateBook(Integer bookId, BookRequest bookRequest);

    void deleteBookById(Integer bookId);
}
