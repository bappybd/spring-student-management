package com.shaiful.Controller;

import com.shaiful.Entity.User;
import com.shaiful.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String showProfile(Model model, Principal principal) {

        String email = principal.getName();
        User user = userService.findByEmail(email);

        System.out.println(email);

        return "user-profile";
    }
}
