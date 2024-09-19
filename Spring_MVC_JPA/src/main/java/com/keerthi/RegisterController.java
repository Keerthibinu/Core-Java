package com.keerthi;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RegisterController {

    private final UserService service;

    public RegisterController(UserService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ModelAndView registerUser(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("username") String username, @RequestParam("pass") String password, HttpServletRequest request, HttpServletResponse response) {
        Details user = new Details();
        user.setId(id);
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        service.saveUser(user);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("success.jsp");
        mv.addObject("name",name);
        return mv;
    }

    @PostMapping("/delete")
    public ModelAndView deleteUser(@RequestParam("userId") int id, HttpServletRequest request, HttpServletResponse response) {
        service.deleteUser(id);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.jsp");
        return mv;
    }

    @PostMapping("/update")
    public ModelAndView updateUser(@RequestParam("id") int id, @RequestParam("username") String username, @RequestParam("name") String name, @RequestParam("pass") String password, HttpServletRequest request, HttpServletResponse response) {
        service.updateUser(id,name,username,password);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.jsp");
        return mv;
    }

    @GetMapping("/displayUsers")
    public ModelAndView displayUsers() {
        List<Details> users = service.displayUsers();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("printAll.jsp");
        mv.addObject("users", users);
        return mv;
    }
}
