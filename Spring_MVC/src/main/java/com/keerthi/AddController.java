package com.keerthi;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @PostMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j/*, HttpServletRequest request, HttpServletResponse response*/) {
        //int i = Integer.parseInt(request.getParameter("t1"));
        //int j = Integer.parseInt(request.getParameter("t2"));
        int k = i+j;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success.jsp");
        mv.addObject("result",k);
        return mv;
    }
}
