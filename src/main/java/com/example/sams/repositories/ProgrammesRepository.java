package com.example.sams.repositories;

import com.example.sams.model.Programmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammesRepository extends JpaRepository<Programmes, Long> {
    Programmes getByprogramCode(String programCode);
}
