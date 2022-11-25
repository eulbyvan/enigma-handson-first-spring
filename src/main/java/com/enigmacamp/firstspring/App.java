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

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        ICourseService courseService = ctx.getBean(ICourseService.class);
        System.out.println("Course Service Object Id");
        System.out.println(courseService);
        Course springCourse = new Course();
        springCourse.setCourseId("123");
        springCourse.setDescription("Spring IoC");
        springCourse.setTitle("Spring IoC Fundamental");
        courseService.create(springCourse);


        ICourseService courseService2 = ctx.getBean(ICourseService.class);
        System.out.println("Course Service 2 Object Id");
        System.out.println(courseService2);
        Course reactCourse = new Course();
        reactCourse.setCourseId("456");
        reactCourse.setDescription("React redux state management");
        reactCourse.setTitle("React Redux");
        courseService2.create(reactCourse);

        List<Course> courseList = courseService.list();
        System.out.println(courseList);

        List<Course> courseList2 = courseService2.list();
        System.out.println(courseList2);

        Double phi = ctx.getBean(Double.class);
        System.out.println(phi);

        String[] beanNames = ctx.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
    }
}
