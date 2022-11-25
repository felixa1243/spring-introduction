package com.enigma.idk.services;

import com.enigma.idk.models.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseService implements  ICourseService {
    private List<Course> courseList =  new ArrayList<>();
    @Override
    public Course create(Course course){
        courseList.add(course);
        return course;
    }
    @Override
    public List<Course> list (){
        return courseList;
    }
    @Override
    public Course getOne(String id){
        Course course = null;
        for (Course c:courseList){
            course = c;
        }
        return course;
    }
}
