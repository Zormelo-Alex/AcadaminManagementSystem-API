package com.example.sams.repositories;

import com.example.sams.model.Repetition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepetitionRepository extends JpaRepository<Repetition, Long> {
    Repetition getByrepetitionID(Long repetitionID);

    Repetition getBystudentID(String studentID);
}
