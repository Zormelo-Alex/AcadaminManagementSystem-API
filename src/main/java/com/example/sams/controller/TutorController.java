package com.example.sams.controller;

import com.example.sams.dto.TutorAddRequest;
import com.example.sams.model.Student;
import com.example.sams.model.Tutor;
import com.example.sams.services.TutorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tutor")
@Tag(name = "Tutors", description = "Tutor APIs")
public class TutorController {
    @Autowired
    private TutorService tutorService;

    @PostMapping("/addTutor")
    public ResponseEntity<?> createTutor(@RequestBody TutorAddRequest tutorAddRequest) {
        try {
            Tutor tutor = new Tutor();
            tutor.setTutorID(tutorAddRequest.getTutorID());
            tutor.setFirstName(tutorAddRequest.getFirstName());
            tutor.setLastName(tutorAddRequest.getLastName());
            tutor.setAddress(tutorAddRequest.getAddress());
            tutor.setEmailAddress(tutorAddRequest.getEmailAddress());
            tutor.setDOB(new Date());
            tutor.setCreateDate(new Date());
            tutor.setEmergAddress(tutorAddRequest.getAddress());
            tutor.setDepartmentID(tutorAddRequest.getDepartmentID());
            tutor.setCreateDate(new Date());


            Tutor createdTutor = tutorService.addTutor(tutor);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "tutor.created",
                    "Tutor", createdTutor));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "tutor.create.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/allTutors")
    public ResponseEntity<?> getAllTutors(HttpServletRequest request) {
        try {
            List<Tutor> response = tutorService.getAllUsers();
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "tutors.get.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTutorById(@PathVariable String id) {
        try {
            Tutor tutor = tutorService.findTutorById(id);
            if (tutor == null) {
                return ResponseEntity.notFound().build(); // 404 Not Found
            }
            return ResponseEntity.ok(tutor);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "tutor.get.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTutor(@PathVariable String id, @RequestBody TutorAddRequest tutorAddRequest) {
        try {
            Tutor existingTutor = tutorService.findTutorById(id);
            if (existingTutor == null) {
                return ResponseEntity.notFound().build();
            }
            existingTutor.setTutorID(tutorAddRequest.getTutorID());
            existingTutor.setFirstName(tutorAddRequest.getFirstName());
            existingTutor.setLastName(tutorAddRequest.getLastName());
            existingTutor.setAddress(tutorAddRequest.getAddress());
            existingTutor.setEmailAddress(tutorAddRequest.getEmailAddress());
            existingTutor.setDOB(tutorAddRequest.getDOB());
            existingTutor.setEmergAddress(tutorAddRequest.getAddress());
            existingTutor.setDepartmentID(tutorAddRequest.getDepartmentID());
            existingTutor.setLastUpdated(new Date());


            Tutor createdTutor = tutorService.updateTutor(existingTutor);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "tutor.updated",
                    "Tutor", createdTutor));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "tutor.create.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchTutor(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
