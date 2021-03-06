package com.shaiful.Controller;

import com.shaiful.Entity.Student;
import com.shaiful.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/students")
public class ApiStudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/all")
    public Collection<Student> all() {
        return studentService.getAll();
    }

    @RequestMapping(value="/save")
    public String save(@RequestParam String name, @RequestParam String course) {
        Student student = new Student(name, course);
        studentService.save(student);
        return "Student save";
    }

    @RequestMapping(value="/delete")
    public String save(@RequestParam int id) {
        studentService.delete(id);
        return "Student deleted";
    }

    /*
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
         studentService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentById(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudentById(@RequestBody Student student) {
        studentService.insertStudent(student);
    }*/
}
