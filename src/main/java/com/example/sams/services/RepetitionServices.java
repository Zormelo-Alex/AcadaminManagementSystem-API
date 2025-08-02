package com.example.sams.services;

import com.example.sams.model.Repetition;
import com.example.sams.repositories.RepetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepetitionServices {

    @Autowired
    private RepetitionRepository repetitionRepository;

    public List<Repetition> getAllRepetitions(){
        return repetitionRepository.findAll();
    }

    public Repetition getRepetitionByStudentID(String id){
        return repetitionRepository.getBystudentID(id);
    }
}
