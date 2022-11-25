package com.enigma.idk;

import com.enigma.idk.models.Course;
import com.enigma.idk.services.CourseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        Course springCourse = new Course();
        springCourse.setCourseId("1");
        springCourse.setDescription("Spring Ioc");
        springCourse.setTitle("Spring Ioc fundamental");

        courseService.create(springCourse);
        List<Course> courseList = courseService.list();
        System.out.println(courseList);
    }
}