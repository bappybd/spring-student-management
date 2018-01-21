package com.shaiful.Service;

import com.shaiful.Dao.StudentRepo;
import com.shaiful.Entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();

        for(Student student : studentRepo.findAll()){
            students.add(student);
        }

        return students;
    }

    public void save(Student student){
        studentRepo.save(student);
    }

    public void delete(int id){
        studentRepo.delete(id);
    }
}
