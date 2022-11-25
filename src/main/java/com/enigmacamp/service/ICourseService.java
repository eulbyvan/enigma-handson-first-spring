package com.enigmacamp.service;

import com.enigmacamp.model.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    List<Course> getCourses();
    Course getCourse(String id);
}
