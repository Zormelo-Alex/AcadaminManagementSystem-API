package com.example.sams.repositories;

import com.example.sams.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {
    Courses getBycourseName(String courseName);
}
