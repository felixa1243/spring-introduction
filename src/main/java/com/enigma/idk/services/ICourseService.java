package com.enigma.idk.services;

import com.enigma.idk.models.Course;

import java.util.List;

public interface ICourseService {
    Course create(Course course);
    List<Course> list();
    Course getOne(String id);
}
