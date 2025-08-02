package com.example.sams.services;

import com.example.sams.model.Tutor;
import com.example.sams.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {
    @Autowired
    private TutorRepository tutorRepository;

    public List<Tutor> getAllUsers() {
        return tutorRepository.findAll();
    }

    public Tutor addTutor(Tutor tutor){
        if (tutorRepository.findBytutorID(tutor.getTutorID()) != null) {
            throw new RuntimeException("Tutor with same ID already exists");
        }
        tutor.setPkID(null);
        return tutorRepository.save(tutor);
    }

    public Tutor findTutorById(String id) {
        return tutorRepository.findBytutorID(id);
    }

    public Tutor updateTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }
}
