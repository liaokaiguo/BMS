package com.bookms.bms.service.Impl;

import com.bookms.bms.bean.BookObject;
import com.bookms.bms.mapper.BookMapper;
import com.bookms.bms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookObject> selectAllBook() {
        return bookMapper.selectAllBooks();
    }
}
