package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public void saveData(@RequestBody BookPojo bookPojo) {
        bookService.saveData(bookPojo);
    }

}
