package com.bookms.bms.controller;

import com.alibaba.fastjson.JSON;
import com.bookms.bms.bean.BookObject;
import com.bookms.bms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/selectAllBooks")
    public String selectAllBooks(){
        return JSON.toJSONString(bookService.selectAllBook());
    }

    @GetMapping("/selectBookByName")
    public String selectBookByName(String name){
        System.out.println(name);
        return JSON.toJSONString(bookService.selectBookByName(name));
    }

    @PostMapping("/insertBook")
    public void insertBook(@RequestBody BookObject bookObject){
        bookService.insertBook(bookObject);
    }
    @PutMapping("/updateBook")
    public void updateBook(@RequestBody BookObject bookObject){
        bookService.updateBook(bookObject);
    }
    @DeleteMapping("/deleteBook")
    public void deleteBook(String bookId){
        bookService.deleteBook(bookId);
    }

}
