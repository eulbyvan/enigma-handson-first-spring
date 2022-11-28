package com.enigmacamp.firstspring;

import com.enigmacamp.firstspring.container.ConsoleRunner;
import com.enigmacamp.firstspring.entity.Course;
import com.enigmacamp.firstspring.service.ICourseService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsoleApp implements ConsoleRunner {
    private final ICourseService courseService;

    public ConsoleApp(ICourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    public void run(String... args) {
        System.out.println("Course Service Object Id");
        System.out.println(courseService);
        Course springCourse = new Course();
        springCourse.setCourseId("123");
        springCourse.setDescription("Spring IoC");
        springCourse.setTitle("Spring IoC Fundamental");
        courseService.create(springCourse);


        System.out.println("Course Service 2 Object Id");
        System.out.println(courseService);
        Course reactCourse = new Course();
        reactCourse.setCourseId("456");
        reactCourse.setDescription("React redux state management");
        reactCourse.setTitle("React Redux");
        courseService.create(reactCourse);

        List<Course> courseList = courseService.list();
        System.out.println(courseList);

        List<Course> courseList2 = courseService.list();
        System.out.println(courseList2);
    }
}
