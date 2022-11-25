package com.enigma.idk.repository;

import com.enigma.idk.models.Course;

import java.util.ArrayList;
import java.util.List;

public class CourserArrayRepo implements ICourseRepository {
    private List<Course> arrayList = new ArrayList<>();

    @Override
    public Course create(Course course){
        arrayList.add(course);
        return course;
    }
    @Override
    public List<Course> getAll(){
        return arrayList;
    }

    @Override
    public Course findOne(String id) {
        Course course = null;
        for (Course c:
                arrayList) {
            course = c;
        }
        return course;
    }
    @Override
    public void delete(int id){
        arrayList.remove(id);
    }

    @Override
    public void update(int id, Course course) {
        arrayList.set(id, course);
    }
}
