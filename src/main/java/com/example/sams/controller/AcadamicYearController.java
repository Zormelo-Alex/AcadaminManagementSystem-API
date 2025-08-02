package com.example.sams.controller;

import com.example.sams.model.AcademicYears;
import com.example.sams.services.AcademeicYearServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/acadamic")
public class AcadamicYearController {

    @Autowired
    private AcademeicYearServices academeicYearServices;

    @PostMapping("/addYear")
    public ResponseEntity<String> addyear(HttpServletRequest request){
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allYears")
    public List<AcademicYears> getAllYears(HttpServletRequest request){
        return academeicYearServices.getAllAcademicYears();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getYear(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon..." + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateYear(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon..." + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
