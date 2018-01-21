package com.shaiful.Dao;


import com.shaiful.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
    
}
