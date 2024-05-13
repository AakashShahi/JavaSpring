package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
import com.example.demo.entity.User;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.GroundRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {


    private final GroundRepository groundRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRespository;

    @Override
    public void saveData(BookPojo bookPojo) {
        Book book = new Book();
        book.setBookName(bookPojo.getBookName());
        Ground ground= groundRepository.findById(bookPojo.getGroundId()).get();
        book.setGround(ground);

        User user = userRespository.findById(bookPojo.getGroundId()).get();
        book.setUser(user);
        bookRepository.save(book);


    }


    @Override
    public List<Ground> findAll() {
        return List.of();
    }
}
