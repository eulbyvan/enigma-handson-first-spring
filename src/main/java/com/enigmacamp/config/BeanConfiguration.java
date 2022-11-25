package com.enigmacamp.config;

import com.enigmacamp.repo.CourseArrayRepo;
import com.enigmacamp.repo.ICourseRepo;
import com.enigmacamp.service.CourseService;
import com.enigmacamp.service.ICourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean("courseRepoBean")
    public ICourseRepo getCourseRepo() {
        return new CourseArrayRepo();
    }

    @Bean("courseServiceBean")
    public ICourseService getCourseService() {
        return new CourseService(getCourseRepo());
    }

    @Bean
    public Double getPi(){
        return Math.PI;
    }
}
