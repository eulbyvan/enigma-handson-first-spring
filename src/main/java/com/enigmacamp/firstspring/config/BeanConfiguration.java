package com.enigmacamp.firstspring.config;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class BeanConfiguration {
    @Bean
    public Lorem getLorem() {
        return LoremIpsum.getInstance();
    }
}
