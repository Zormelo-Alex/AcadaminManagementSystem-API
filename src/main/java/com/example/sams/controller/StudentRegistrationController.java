package com.example.sams.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studentRegistration")
public class StudentRegistrationController {

    @GetMapping("/allStudentRegistrations")
    public ResponseEntity<String> allStudentRegistrations(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allRegisteredStudents")
    public ResponseEntity<String> allRegisteredStudents(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/RegisteredStudent/{id}")
    public ResponseEntity<String> getRegisteredStudent(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon..." + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/bulkRegistration")
    public ResponseEntity<String> bulkRegistration(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/registerStudent/{id}")
    public ResponseEntity<String> registerStudent(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon..." + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
