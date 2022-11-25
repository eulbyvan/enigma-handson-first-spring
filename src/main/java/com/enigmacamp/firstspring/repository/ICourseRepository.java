package com.enigmacamp.firstspring.repository;

import com.enigmacamp.firstspring.entity.Course;

import java.util.List;

public interface ICourseRepository {
    List<Course> getAll();

    Course create(Course course);

    Course findOne(String id);

}
