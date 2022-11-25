package com.enigmacamp.firstspring.service;

import com.enigmacamp.firstspring.entity.Course;
import com.enigmacamp.firstspring.repository.ICourseRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseService implements ICourseService {
    private ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course create(Course course) {
        return courseRepository.create(course);
    }

    public List<Course> list() {
        return courseRepository.getAll();
    }

    public Course getOne(String id) {
        return courseRepository.findOne(id);
    }
}
