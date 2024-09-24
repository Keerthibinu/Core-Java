package com.keerthi.SpringBoot_demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/userLogin")
    public String login() {
        return "userLogin";
    }

    @GetMapping("/userRegister")
    public String register() {
        return "userRegister";
    }

    @GetMapping("/read")
    public String read() {
        return "read";
    }

    @GetMapping("/update")
    public String update() {
        return "update";
    }

    @GetMapping("/delete")
    public String delete() {
        return "delete";
    }

}
