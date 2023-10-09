package com.assingment.EncompassesHandling.Repo;

import com.assingment.EncompassesHandling.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Long> {
}
