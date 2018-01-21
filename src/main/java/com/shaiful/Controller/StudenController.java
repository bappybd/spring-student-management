package com.shaiful.Controller;

import com.shaiful.Dao.StudentRepo;
import com.shaiful.Repository.StudentRepository;
import com.shaiful.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudenController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public String home(Model model, @RequestParam(defaultValue = "0") int page){

        model.addAttribute("currentPage", page);
        model.addAttribute("data", this.studentRepository.
                findAll(new PageRequest(page, 4)));

        return "students";
    }

}
