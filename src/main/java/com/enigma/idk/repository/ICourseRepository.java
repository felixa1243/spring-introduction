package com.enigma.idk.repository;

import com.enigma.idk.models.Course;

import java.util.List;

public interface ICourseRepository {
    List<Course> getAll();
    Course create(Course course);
    Course findOne(String id);
    void delete(int id);
    void update(int id,Course course);
}
