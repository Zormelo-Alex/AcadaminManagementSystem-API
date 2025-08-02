package com.example.sams.controller;

import com.example.sams.model.Courses;
import com.example.sams.services.CourseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CoursesController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public ResponseEntity<String> addCourse(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allCourses")
    public List<Courses> getAllCourses(HttpServletRequest request){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getCourse(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
