package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.GroundRepository;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {


    private final GroundRepository groundRepository;
    private final BookRepository bookRepository;

    public BookServiceImpl(GroundRepository groundRepository, BookRepository bookRepository) {
        this.groundRepository = groundRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void saveData(BookPojo bookPojo) {
        Book book = new Book();
        book.setBookName(bookPojo.getBookName());
        Ground ground= groundRepository.findById(bookPojo.getGroundId()).get();
        book.setGround(ground);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
