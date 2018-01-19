package com.shaiful.Service;

import com.shaiful.Dao.StudentDao;
import com.shaiful.Entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;


    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }
}
