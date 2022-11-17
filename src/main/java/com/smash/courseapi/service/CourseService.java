package com.smash.courseapi.service;

import com.smash.courseapi.domain.Course;

import java.util.Optional;

public interface CourseService {
    Iterable<Course> findCourses();
    Optional<Course> findCourse(Long id);

    void save(Course course);
//    void deleteById(Long id);
//    Course findCourseById(Long id);
}
