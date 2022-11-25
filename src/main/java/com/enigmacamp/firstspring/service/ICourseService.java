package com.enigmacamp.firstspring.service;

import com.enigmacamp.firstspring.entity.Course;

import java.util.List;

// Penggunaan interface akan membuat kebutuhan dep menjadi loose coupling
// Obj Dep akan menjadi lebih fleksibel dalam implementasinya
// Sesuai dengan prinsip Open For Extension, Close For Modification
public interface ICourseService {
    Course create(Course course);

    List<Course> list();

    Course getOne(String id);
}
