package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookPojo;

import java.util.List;

public interface BookService {
    void saveData(BookPojo bookPojo);
    List<Book> findAll();
}
