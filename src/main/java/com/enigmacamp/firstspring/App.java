package com.enigmacamp.firstspring;

import com.enigmacamp.firstspring.entity.Course;
import com.enigmacamp.firstspring.service.CourseService;
import com.enigmacamp.firstspring.service.ICourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {


        // Penerapan IoC, tanggung jawab pembentukan obj CourseService diserahkan
//        ke spring framework
//        Deklarasi object ada 2 cara
//        1. XML
//        2. Java
//        Object dependensi yang didaftarkan di Spring IoC Container disebuat bean
//        Untuk menggunakan spring bean di class yang membutuhkan, kita gunakan
//        Spring Context

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ICourseService courseService = (ICourseService) context.getBean("courseService");

        Course springCourse = new Course();
        springCourse.setCourseId("123");
        springCourse.setDescription("Spring IoC");
        springCourse.setTitle("Spring IoC Fundamental");
        courseService.create(springCourse);
        List<Course> courseList = courseService.list();
        System.out.println(courseList);
    }
}
