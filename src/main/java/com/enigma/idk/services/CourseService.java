package com.enigma.idk.services;

import com.enigma.idk.models.Course;
import com.enigma.idk.repository.ICourseRepository;

import java.util.List;

public class CourseService implements ICourseService {
    private final ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course create(Course course) {
        courseRepository.create(course);
        return course;
    }

    @Override
    public List<Course> list() {
        return courseRepository.getAll();
    }

    @Override
    public Course getOne(String id) {
        Course course = null;
        for (Course c : courseRepository.getAll()) {
            course = c;
        }
        return course;
    }

    @Override
    public void update(int id, Course course) {
        courseRepository.update(id, course);
    }

    @Override
    public void delete(int id) {
        courseRepository.delete(id);
    }
}
