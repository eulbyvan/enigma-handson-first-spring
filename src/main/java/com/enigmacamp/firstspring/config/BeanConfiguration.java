package com.enigmacamp.firstspring.config;

import com.enigmacamp.firstspring.repository.CourseArrayRepository;
import com.enigmacamp.firstspring.repository.ICourseRepository;
import com.enigmacamp.firstspring.service.CourseService;
import com.enigmacamp.firstspring.service.ICourseService;
import com.enigmacamp.firstspring.util.IRandomStringGenerator;
import com.enigmacamp.firstspring.util.RandomInt;
import com.enigmacamp.firstspring.util.UuidGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class BeanConfiguration {
    @Value("${generator.type}")
    String randomGenerator;

    @Bean("courseRepositoryBean")
//    @Scope("prototype")
    public ICourseRepository getCourseRepository() {
        if (randomGenerator.equals("uuid")) {
            return new CourseArrayRepository(getRandomUuid());
        }
        return new CourseArrayRepository(getRandomInt());

    }

    @Bean("courseServiceBean")
//    @Scope("prototype")
    public ICourseService getCourseService() {
        return
                new CourseService(getCourseRepository());
    }

    @Bean
    public Double getPhi() {
        return 3.14;
    }

    @Bean
    @Qualifier("uuid")
    public IRandomStringGenerator getRandomUuid() {
        return new UuidGenerator();
    }

    @Bean
    @Qualifier("int")
    public IRandomStringGenerator getRandomInt() {
        return new RandomInt();
    }
}
