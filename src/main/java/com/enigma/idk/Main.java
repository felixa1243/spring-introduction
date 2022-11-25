package com.enigma.idk;

import com.enigma.idk.config.BeanConfiguration;
import com.enigma.idk.models.Course;
import com.enigma.idk.services.ICourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
        ctx.register(BeanConfiguration.class);
        ctx.refresh();
        ICourseService courseService = ctx.getBean(ICourseService.class);
        ICourseService courseService2 = ctx.getBean(ICourseService.class);

        Course springCourse = new Course();
        springCourse.setCourseId("1");
        springCourse.setDescription("Spring Ioc");
        springCourse.setTitle("Spring Ioc fundamental");

        courseService.create(springCourse);
        System.out.println(courseService.list());

        springCourse.setTitle("React redux");
        springCourse.setDescription("StateManagement");
        courseService.update(0, springCourse);
        System.out.println(courseService.list());

        courseService.delete(0);
        System.out.println(courseService.list());
    }
}