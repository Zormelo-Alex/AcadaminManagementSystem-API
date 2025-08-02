package com.example.sams.controller;

import com.example.sams.model.Programmes;
import com.example.sams.services.ProgrammesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programme")
public class ProgrammesController {

    @Autowired
    private ProgrammesService programmesService;

    @PostMapping("/addProgramme")
    public ResponseEntity<String> addProgramme(HttpServletRequest request){
        try {
            return ResponseEntity.ok("Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/allProgrammes")
    public List<Programmes> getAllProgrammes(HttpServletRequest request){
       return programmesService.getAllProgrammes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getProgramme(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProgramme(@PathVariable String id){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
