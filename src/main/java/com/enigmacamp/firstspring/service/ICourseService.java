package com.enigmacamp.firstspring.service;

import com.enigmacamp.firstspring.entity.Course;

import java.util.List;

public interface ICourseService {
    Course create(Course course);

    List<Course> list();

    Course getOne(String id);
}
