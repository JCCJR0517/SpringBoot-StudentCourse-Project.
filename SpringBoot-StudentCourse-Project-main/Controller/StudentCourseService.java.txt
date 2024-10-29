package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() throws IOException {
        return studentService.fetchStudents();
    }

    @GetMapping("/students/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentService.findStudentByName(name);
    }
}

