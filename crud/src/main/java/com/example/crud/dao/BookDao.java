package com.example.crud.dao;

import com.example.crud.dto.BookRequest;
import com.example.crud.model.Book;

public interface BookDao {

    Book getBookById(Integer bookId);

    Integer createBook(BookRequest bookRequest);

    void updateBook(Integer bookId, BookRequest bookRequest);

    void deleteBookById(Integer bookId);
}
