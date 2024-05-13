package com.example.demo.service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.BookPojo;
import com.example.demo.projection.BookProjection;

import java.util.List;

public interface BookService {
    void saveData(BookPojo bookPojo);
    List<BookProjection> findAll();
}
