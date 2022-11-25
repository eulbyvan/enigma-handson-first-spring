package com.enigmacamp.repo;

import com.enigmacamp.model.Course;

import java.util.List;

public interface ICourseRepo {
    List<Course> getAll();
    Course create(Course course);
    Course findOne(String id);
}
