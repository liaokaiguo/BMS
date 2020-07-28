package com.bookms.bms.controller;

import com.alibaba.fastjson.JSON;
import com.bookms.bms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/selectAllBooks")
    public String selectAllBooks(){
        return JSON.toJSONString(bookService.selectAllBook());
    }
}
