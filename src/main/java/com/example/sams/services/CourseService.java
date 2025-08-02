package com.example.sams.services;

import com.example.sams.model.Courses;
import com.example.sams.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> getAllCourses(){
        return coursesRepository.findAll();
    }
}
