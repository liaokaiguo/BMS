package com.bookms.bms.mapper;

import com.bookms.bms.bean.BookObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface BookMapper {
    List<BookObject> selectAllBooks();
    BookObject selectBookByName(String name);
    void insertBook(BookObject bookObject);
    void updateBook(BookObject bookObject);
    void deleteBook(String bookId);
}
