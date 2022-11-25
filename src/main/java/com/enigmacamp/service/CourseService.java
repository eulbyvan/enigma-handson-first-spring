package com.enigmacamp.service;

import com.enigmacamp.model.Course;
import com.enigmacamp.repo.ICourseRepo;

import java.util.List;

public class CourseService implements ICourseService {
    private final ICourseRepo courseRepo;

    public CourseService(ICourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepo.create(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepo.getAll();
    }

    @Override
    public Course getCourse(String id) {
        return courseRepo.findOne(id);
    }
}
