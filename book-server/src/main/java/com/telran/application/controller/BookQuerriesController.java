package com.telran.application.controller;

import com.telran.application.model.BookModel;
import dto.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/query")
public class BookQuerriesController {
    @GetMapping(value = "/getAllBooks")
    public HashMap<Long, Book> getAllBooks(){
        return BookModel.getAllBooks();
    }
}
