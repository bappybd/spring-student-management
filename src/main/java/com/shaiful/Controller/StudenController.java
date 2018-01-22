package com.shaiful.Controller;

import com.shaiful.Entity.Student;
import com.shaiful.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PostMapping("/students/save")
    public String save(@ModelAttribute Student student, BindingResult bindingResult ) {
        studentRepository.save(student);
        return "redirect:/students";
    }


    @PostMapping("/students/delete")
    public String delete(Integer id) {
        studentRepository.delete(id);

        return "redirect:/students";
    }

    @GetMapping("/students/findOne")
    @ResponseBody
    public Student findOne(Integer id) {
        return studentRepository.findOne(id);
    }
}
