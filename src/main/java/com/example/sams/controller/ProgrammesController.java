package com.example.sams.controller;

import com.example.sams.model.Programmes;
import com.example.sams.services.ProgrammesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/programme")
public class ProgrammesController {

    @Autowired
    private ProgrammesService programmesService;

    @PostMapping("/addProgramme")
    public ResponseEntity<?> addProgramme(@RequestBody Programmes request){
        try {
            Programmes programmes = new Programmes();
            programmes.setProgramName(request.getProgramName());
            programmes.setDescription(request.getDescription());
            programmes.setNumberOfSemesters(request.getNumberOfSemesters());
            programmes.setProgramCode(request.getProgramCode());
            programmes.setCreateDate(new Date());

            Programmes createdProgramme = programmesService.createProgramme(programmes);


            return ResponseEntity.status(200).body(Map.of(
                    "success", true,
                    "message", "Programme Added",
                    "programme", createdProgramme
            ));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "error", true,
                    "message", e.getMessage()
            ));
        }
    }

    @GetMapping("/allProgrammes")
    public ResponseEntity<?> getAllProgrammes(HttpServletRequest request){
        try {
            List<Programmes> response = programmesService.getAllProgrammes();
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "error", true,
                    "message", e.getMessage()
            ));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProgramme(@PathVariable Long id){
        try {
            Programmes response = programmesService.getProgrammeById(id);
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "error", true,
                    "message", e.getMessage()
            ));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProgramme(@PathVariable Long id, @RequestBody Programmes request){
        try {
            return ResponseEntity.ok("Coming Soon... " + id);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "error", true,
                    "message", e.getMessage()
            ));
        }
    }
}
