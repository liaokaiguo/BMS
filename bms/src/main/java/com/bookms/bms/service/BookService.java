package com.bookms.bms.service;

import com.bookms.bms.bean.BookObject;

import java.util.List;

public interface BookService {
    List<BookObject> selectAllBook();
    BookObject selectBookByName(String name);
    void insertBook(BookObject bookObject);
    void updateBook(BookObject bookObject);
    void deleteBook(String bookId);
}
