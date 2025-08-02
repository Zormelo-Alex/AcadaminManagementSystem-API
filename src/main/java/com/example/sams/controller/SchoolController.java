package com.example.sams.controller;


import com.example.sams.dto.SchoolRequest;
import com.example.sams.model.School;
import com.example.sams.services.SchoolService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/school")
@Tag(name = "School", description = "School APIs")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/addSchool")
    public ResponseEntity<?> createSchool(@RequestBody SchoolRequest schoolRequest) {
        try {
            School school = new School();
            school.setSchoolName(schoolRequest.getSchoolName());
            school.setSchoolId(null);
            school.setSchoolImage(null);
            school.setAddress(schoolRequest.getAddress());
            school.setEmailAddress(schoolRequest.getEmailAddress());
            school.setCreateDate(new Date());
            school.setMobileNumber(schoolRequest.getMobileNumber());
            school.setDistrictCode(schoolRequest.getDistrictCode());
            school.setPhoneNumber(schoolRequest.getPhoneNumber());


            School createdSchool = schoolService.addSchool(school);
            return ResponseEntity.ok(createdSchool);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/")
    public List<School> getAllSchools(HttpServletRequest request) {
        return schoolService.getAllSchools();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSchool(@PathVariable Long id, SchoolRequest schoolRequest) {
        try {
            School existingSchool = schoolService.findSchoolById(id);
            if (existingSchool == null) {
                return ResponseEntity.notFound().build();
            }

            existingSchool.setSchoolName(schoolRequest.getSchoolName());
            existingSchool.setAddress(schoolRequest.getAddress());
            existingSchool.setEmailAddress(schoolRequest.getEmailAddress());
            existingSchool.setMobileNumber(schoolRequest.getMobileNumber());
            existingSchool.setDistrictCode(schoolRequest.getDistrictCode());
            existingSchool.setPhoneNumber(schoolRequest.getPhoneNumber());
            existingSchool.setLastUpdated(new Date()); // Optional: if you track last update

            School updatedSchool = schoolService.updateSchool(existingSchool);

            return ResponseEntity.ok(updatedSchool);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
