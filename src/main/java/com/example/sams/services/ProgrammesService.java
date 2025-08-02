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

    public Programmes getProgrammeById(Long id){
        return programmesRepository.getByPGID(id);
    }

    public Programmes createProgramme(Programmes programmes){
        if (programmesRepository.getByprogramCode(programmes.getProgramCode()) != null) {
            throw new RuntimeException("Programme with same ID already exists");
        }
        System.out.println(programmes.getProgramName());
        programmes.setPG_ID(null);
        return programmesRepository.save(programmes);
    }
}
