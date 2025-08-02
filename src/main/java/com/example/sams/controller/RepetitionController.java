package com.example.sams.controller;

import com.example.sams.model.Repetition;
import com.example.sams.services.RepetitionServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/repetition")
public class RepetitionController {
    @Autowired
    private RepetitionServices repetitionServices;

    @GetMapping("/")
    public ResponseEntity<?> getAllRepitition(HttpServletRequest request){
        try {
            List<Repetition> response = repetitionServices.getAllRepetitions();
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of("Error", true,
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/studentInfo")
    public ResponseEntity<?> studentInfo(HttpServletRequest request){
        try {
            List<Repetition> response = repetitionServices.getAllRepetitions();
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of("Error", true,
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/repeatedStudent")
    public ResponseEntity<?> studentInfo(@RequestParam String studentId) {
        try {
            Repetition response = repetitionServices.getRepetitionByStudentID(studentId);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "error", true,
                    "message", e.getMessage()
            ));
        }
    }

    @PutMapping("/repeatStudent")
    public ResponseEntity<?> repeatStudent(HttpServletRequest request){
        try {
            return ResponseEntity.status(200).body(Map.of(
                    "success", true,
                    "message", "repeated successfully..."
            ));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "error", true,
                    "message", e.getMessage()
            ));
        }
    }
}
