package com.sstech.server.main.service;

import com.sstech.server.main.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    List<Student> getAllStudent();
    void deleteStudent(String id);
    Student getStudentByName(String name);
}
