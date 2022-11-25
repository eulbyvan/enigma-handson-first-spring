package com.enigmacamp.firstspring.repository;

import com.enigmacamp.firstspring.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseArrayRepository implements ICourseRepository {
    private List<Course> courseList = new ArrayList<>();

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public Course create(Course course) {
        courseList.add(course);
        return course;
    }

    @Override
    public Course findOne(String id) {
        Course course = null;
        for (Course c : courseList) {
            if (c.getCourseId().equals(id)) {
                course = c;
            }
        }
        return course;
    }
}
