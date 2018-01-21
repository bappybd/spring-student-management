package com.shaiful.Controller;

import com.shaiful.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
