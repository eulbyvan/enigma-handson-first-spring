package com.enigmacamp.firstspring;

import com.enigmacamp.firstspring.config.BeanConfiguration;
import com.enigmacamp.firstspring.entity.Course;
import com.enigmacamp.firstspring.service.ICourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(BeanConfiguration.class);
        ctx.refresh();
        ICourseService courseService = ctx.getBean(ICourseService.class);

        Course springCourse = new Course();
        springCourse.setCourseId("123");
        springCourse.setDescription("Spring IoC");
        springCourse.setTitle("Spring IoC Fundamental");
        courseService.create(springCourse);
        List<Course> courseList = courseService.list();
        System.out.println(courseList);
    }
}
