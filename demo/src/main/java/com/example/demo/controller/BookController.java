package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
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

//    @PostMapping
//    public void saveData(@RequestBody BookPojo bookPojo) {
//        bookService.saveData(bookPojo);
//    }
//
//    @GetMapping
//    public List<Book> getAllBooks() {
//        return bookService.findAll();
//    }
@GetMapping
public GlobalApiResponse<List<Ground>> getData() {
    return GlobalApiResponse.
            <List<Ground>>builder()
            .data(this.bookService.findAll())
            .statusCode(200)
            .message("data retreived successfully")
            .build();
}

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody BookPojo bookPojo) {
        this.bookService.saveData(bookPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }


}
