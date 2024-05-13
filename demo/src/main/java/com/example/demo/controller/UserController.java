package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.pojo.UserPojo;
import com.example.demo.service.UserService;
import com.example.demo.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
        private final UserService userService;

        @PostMapping
        public GlobalApiResponse<String> save(@RequestBody UserPojo userPojo) {
            this.userService.saveUser(userPojo);
            return GlobalApiResponse.
                    <String>builder()
                    .data("saved")
                    .statusCode(200)
                    .message("data saved successfully")
                    .build();
        }

        @GetMapping
        public GlobalApiResponse<List<User>> getUser() {
            return GlobalApiResponse.
                    <List<User>>builder()
                    .data(this.userService.getAll())
                    .statusCode(200)
                    .message("Data retreived successfully")
                    .build();


        }
}
