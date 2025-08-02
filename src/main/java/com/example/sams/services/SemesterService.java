package com.example.sams.services;

import com.example.sams.model.Semester;
import com.example.sams.model.SemesterRegistration;
import com.example.sams.repositories.SemesterRegistrationRepository;
import com.example.sams.repositories.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterService {
    @Autowired
    private SemesterRepository semesterRepository;

    @Autowired
    private SemesterRegistrationRepository semesterRegistrationRepository;

    public List<Semester>getAllSemesters(){
        return semesterRepository.findAll();
    }

    public List<SemesterRegistration>getAllSemesterRegistrations(){
        return semesterRegistrationRepository.findAll();
    }
}
