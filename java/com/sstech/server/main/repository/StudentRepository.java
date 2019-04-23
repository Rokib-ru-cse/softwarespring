package com.sstech.server.main.repository;

import com.sstech.server.main.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findStudentByName(String name);
}
