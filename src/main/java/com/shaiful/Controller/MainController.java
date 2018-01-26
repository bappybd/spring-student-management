package com.shaiful.Controller;

import com.shaiful.Entity.User;
import com.shaiful.Service.StudentService;
import com.shaiful.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("user", new User());
        return "registerForm";
    }

    @PostMapping("/register")
    public String registerUser(@Valid User user, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "registerForm";
        }

        if(userService.isUserPresent(user.getEmail())){
            model.addAttribute("exists", true);
            return "registerForm";
        }

        userService.createUser(user);

        return "success";
    }

    @GetMapping("/login")
    public String showLoginForm() {

        return "user-login";
    }
}
