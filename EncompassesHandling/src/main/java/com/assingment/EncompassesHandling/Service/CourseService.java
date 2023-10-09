package com.assingment.EncompassesHandling.Service;

import com.assingment.EncompassesHandling.Model.Course;
import com.assingment.EncompassesHandling.Repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourses(Course newCourses) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(newCourses);
        courseRepo.saveAll(courseList);
        return  courseList.size() + " are new courses added";
    }


    public Course getACourse(Integer id) {
        return courseRepo.findById(id).orElse(null);
    }

    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }
}
