package com.example.sams.controller;

import com.example.sams.model.StudentProgrammes;
import com.example.sams.services.StudentProgrammesServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/studentProgrammes")
public class StudentProgrammesController {
    @Autowired
    private StudentProgrammesServices studentProgrammesServices;

    @PostMapping("/addStudentProgramme")
    public ResponseEntity<?> addStudentProgramme(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allStudentProgrammes")
    public ResponseEntity<?> allStudentProgrammes(HttpServletRequest request){
        try {
            List<StudentProgrammes> response = studentProgrammesServices.getAllStudentProgrammes();
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "studentProgrammes.get.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentProgramme(@PathVariable Long id){
        try {
            StudentProgrammes response = studentProgrammesServices.findStudentProgrammesById(id);
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "studentProgramme.get.error",
                    "message", e.getMessage()));
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
