package com.assingment.EncompassesHandling.Controller;

import com.assingment.EncompassesHandling.Model.Course;
import com.assingment.EncompassesHandling.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("courses")
    public String addCourses(@RequestBody Course newCourses) {
        return courseService.addCourses(newCourses);
    }
    @GetMapping("course/{id}")
    public Course getACourse(@PathVariable Integer id) {
        return courseService.getACourse(id);
    }
    @GetMapping("courses")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }
}
