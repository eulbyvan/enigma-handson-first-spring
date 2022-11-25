package com.enigmacamp;

import com.enigmacamp.config.BeanConfiguration;
import com.enigmacamp.model.Course;
import com.enigmacamp.service.ICourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        ICourseService courseService = ctx.getBean(ICourseService.class);

        Course course1 = new Course();
        course1.setId("1");
        course1.setTitle("stu");
        course1.setDescription("pid");
        courseService.addCourse(course1);

        ICourseService courseService2 = ctx.getBean(ICourseService.class);
        Course course2 = new Course();
        course2.setId("2");
        course2.setTitle("stuu");
        course2.setDescription("pidd");
        courseService2.addCourse(course2);

        List<Course> courses1 = courseService.getCourses();
        System.out.println(courses1);

        List<Course> courses2 = courseService2.getCourses();
        System.out.println(courses2);

        Double pi = ctx.getBean(Double.class);
        System.out.println(pi);
    }
}