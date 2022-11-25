package com.enigmacamp.firstspring.config;

import com.enigmacamp.firstspring.service.CourseService;
import com.enigmacamp.firstspring.service.ICourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ICourseService getCourseService() {
        return new CourseService();
    }
}
