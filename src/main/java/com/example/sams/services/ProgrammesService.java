package com.example.sams.services;

import com.example.sams.model.Programmes;
import com.example.sams.repositories.ProgrammesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammesService {

    @Autowired
    private ProgrammesRepository programmesRepository;

    public List<Programmes> getAllProgrammes(){
        return programmesRepository.findAll();
    }
}
