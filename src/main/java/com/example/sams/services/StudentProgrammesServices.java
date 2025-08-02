package com.example.sams.services;

import com.example.sams.model.StudentProgrammes;
import com.example.sams.repositories.StudentProgrammesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProgrammesServices {
    @Autowired
    private StudentProgrammesRepository studentProgrammesRepository;

    public List<StudentProgrammes> getAllStudentProgrammes(){
        return studentProgrammesRepository.findAll();
    }

    public StudentProgrammes findStudentProgrammesById(Long id){
        return studentProgrammesRepository.findBypkid(id);
    }
}
