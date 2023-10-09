package com.assingment.EncompassesHandling.Repo;

import com.assingment.EncompassesHandling.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course, Integer> {
}
