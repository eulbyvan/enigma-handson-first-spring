package com.enigmacamp.firstspring;

import com.enigmacamp.firstspring.entity.Course;
import com.enigmacamp.firstspring.service.CourseService;
import com.enigmacamp.firstspring.service.ICourseService;

import java.util.List;

public class App {
    public static void main(String[] args) {

        //Ngga banget nih....
        //1. CourseService adalah dependensi dari class App
//        Ini bukan tanggung jawab dari class Main untuk membuat object dep
//        (CourseService)
        ICourseService courseService = new CourseService();

        Course springCourse = new Course();
        springCourse.setCourseId("123");
        springCourse.setDescription("Spring IoC");
        springCourse.setTitle("Spring IoC Fundamental");
        courseService.create(springCourse);
        List<Course> courseList = courseService.list();
        System.out.println(courseList);
    }
}
