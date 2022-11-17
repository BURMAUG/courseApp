package com.smash.courseapi.controller;

import com.smash.courseapi.domain.Course;
import com.smash.courseapi.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/courses")
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping()
    public Iterable<Course> courses(){
        return courseService.findCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> retrieveCourseById(@PathVariable Long id){
        return courseService.findCourse(id);
    }

    @PostMapping("/course")
    public void addCourse(@RequestBody Course course){
        courseService.save(course);
    }
}
