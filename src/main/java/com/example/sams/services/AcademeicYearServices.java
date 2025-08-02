package com.example.sams.services;

import com.example.sams.model.AcademicYears;
import com.example.sams.repositories.AcademicYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademeicYearServices {
    @Autowired
    private AcademicYearRepository academicYearRepository;

    public List<AcademicYears> getAllAcademicYears(){
        return  academicYearRepository.findAll();
    }
}
