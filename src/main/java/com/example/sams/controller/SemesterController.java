package com.example.sams.controller;

import com.example.sams.model.Semester;
import com.example.sams.model.SemesterRegistration;
import com.example.sams.services.SemesterService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/semester")
@Tag(name = "Semester", description = "Semester APIs")
public class SemesterController {

    @Autowired
    private SemesterService semesterService;

    @PostMapping("/addSemester")
    public ResponseEntity<String> addSemester(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/closeSemester/{id}")
    public ResponseEntity<String> closeSemester(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/computeSemesterResults")
    public ResponseEntity<String> computeSemesterResults(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon... ");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/discloseSemesterResults")
    public ResponseEntity<String> discloseSemesterResults(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon... ");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/addSemesterCourses")
    public ResponseEntity<String> addSemesterCourses(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon... ");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allSemesters")
    public List<Semester> getAllSemesters(HttpServletRequest request){
        return semesterService.getAllSemesters();
    }

    @GetMapping("/allRegisteredSemesters")
    public List<SemesterRegistration> getAllSemestersRegistered(HttpServletRequest request){
        return semesterService.getAllSemesterRegistrations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getSingleSemester(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateSemester(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
