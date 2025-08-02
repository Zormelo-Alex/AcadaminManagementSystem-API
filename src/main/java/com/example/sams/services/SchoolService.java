package com.example.sams.services;

import com.example.sams.model.School;
import com.example.sams.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School addSchool(School school){
        if (schoolRepository.findByschoolName(school.getSchoolName()) != null) {
            throw new RuntimeException("School name already exists");
        }
        school.setSchoolId(null);
        return schoolRepository.save(school);
    }

    public School findSchoolById(Long id) {
        return schoolRepository.findById(id).orElse(null);
    }

    public School updateSchool(School school) {
        return schoolRepository.save(school);
    }
}
