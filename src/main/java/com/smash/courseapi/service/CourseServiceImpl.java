package com.smash.courseapi.service;

import com.smash.courseapi.domain.Course;
import com.smash.courseapi.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;

    @Override
    public Iterable<Course> findCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> findCourse(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }


}
