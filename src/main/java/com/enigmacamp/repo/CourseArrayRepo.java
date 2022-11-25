package com.enigmacamp.repo;

import com.enigmacamp.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseArrayRepo implements ICourseRepo{
    List<Course> courseList = new ArrayList<>();

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
            if(c.getId().equals(id)) {
                course = c;
            }
        }

        return course;
    }
}
