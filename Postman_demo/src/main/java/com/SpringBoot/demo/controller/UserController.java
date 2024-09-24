package com.SpringBoot.demo.controller;

import com.SpringBoot.demo.model.User;
import com.SpringBoot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/users/create")
    public String createUser(@RequestBody User user) {
        service.createUser(user);
        return "User Created";
    }

    @GetMapping("/users/read")
    public String readUser(@RequestParam int id) {
        return service.readUser(id).toString();
    }

    @PostMapping("/users/update")
    public String updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/users/delete/{id}")
    public String  deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }

}
