package com.assingment.EncompassesHandling.Service;

import com.assingment.EncompassesHandling.Model.Student;
import com.assingment.EncompassesHandling.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudents(Student newStudent) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(newStudent);
        studentRepo.saveAll(studentList);
        return studentList.size() + " students are added!!";
    }

    public Optional<Student> getAStudent(Long id) {
        return studentRepo.findById(id);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
