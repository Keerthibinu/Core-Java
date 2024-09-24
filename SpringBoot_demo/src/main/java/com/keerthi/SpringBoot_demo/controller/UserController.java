package com.keerthi.SpringBoot_demo.controller;

import com.keerthi.SpringBoot_demo.model.User;
import com.keerthi.SpringBoot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ModelAndView saveUser(@ModelAttribute User userData) {
        String result = userService.saveUser(userData);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", userData);
        if(result.equals("Saved"))
            mv.setViewName("success");
        else {
            System.out.println("Username exists");
            mv.setViewName("userRegister");
        }
        return mv;
    }

    @PostMapping("/check")
    public ModelAndView checkUser(@ModelAttribute User userData) {
        boolean valid = userService.checkUser(userData);
        ModelAndView mv = new ModelAndView();
        if(valid)
            mv.setViewName("success");
        else
            mv.setViewName("userLogin");
        return mv;
    }

    @GetMapping("/readUser")
    public String readUser(@RequestParam("id") int id) {
        return userService.readUser(id).toString();
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute User user) {
        return userService.updateUser(user);
    }

    @PostMapping("/deleteUser")
    public String  deleteUser(@RequestParam("id") int id) {
        return userService.deleteUser(id);
    }
}
