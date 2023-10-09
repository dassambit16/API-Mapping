package com.assingment.EncompassesHandling.Controller;

import com.assingment.EncompassesHandling.Model.Student;
import com.assingment.EncompassesHandling.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("students")
    public String addStudents(@RequestBody Student newStudent) {
        return studentService.addStudents(newStudent);
    }

    @GetMapping("student/{id}")
    public Optional<Student> getAStudent(@PathVariable Long id) {
        return studentService.getAStudent(id);
    }
    @GetMapping("student")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
}
