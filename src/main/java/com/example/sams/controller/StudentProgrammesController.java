package com.example.sams.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studentProgrammes")
public class StudentProgrammesController {

    @PostMapping("/addStudentProgramme")
    public ResponseEntity<String> addStudentProgramme(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allStudentProgrammes")
    public ResponseEntity<String> allStudentProgrammes(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getStudentProgramme(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudentProgramme(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
