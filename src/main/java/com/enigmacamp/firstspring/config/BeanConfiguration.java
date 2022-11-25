package com.enigmacamp.firstspring.config;

import com.enigmacamp.firstspring.repository.CourseArrayRepository;
import com.enigmacamp.firstspring.repository.ICourseRepository;
import com.enigmacamp.firstspring.service.CourseService;
import com.enigmacamp.firstspring.service.ICourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
    @Bean("courseRepositoryBean")
//    @Scope("prototype")
    public ICourseRepository getCourseRepository() {
        return new CourseArrayRepository();
    }

    @Bean("courseServiceBean")
//    @Scope("prototype")
    public ICourseService getCourseService() {
        return new CourseService(getCourseRepository());
    }

    @Bean
    public Double getPhi() {
        return 3.14;
    }
}
