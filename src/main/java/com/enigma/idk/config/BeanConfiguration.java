package com.enigma.idk.config;

import com.enigma.idk.repository.CourserArrayRepo;
import com.enigma.idk.repository.ICourseRepository;
import com.enigma.idk.services.CourseService;
import com.enigma.idk.services.ICourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
    @Bean
    @Scope("singleton")
    public ICourseRepository getCourseRepository(){
        return new CourserArrayRepo();
    }
    @Bean
    @Scope("singleton")
    public ICourseService getCourseService(){
        return new CourseService(getCourseRepository());
    }
}
