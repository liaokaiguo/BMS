package com.bookms.bms.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class BookObject {
    private String bookId;

    private String name;

    private String publishHouse;

    private String author;

    private String abstractBook;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;

}
