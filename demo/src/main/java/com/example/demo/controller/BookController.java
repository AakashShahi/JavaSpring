package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import com.example.demo.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public void saveData(@RequestBody BookPojo bookPojo) {
        bookService.saveData(bookPojo);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }


}
