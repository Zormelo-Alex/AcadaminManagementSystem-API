package com.example.sams.repositories;

import com.example.sams.model.StudentProgrammes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProgrammesRepository extends JpaRepository<StudentProgrammes, Long> {
    StudentProgrammes findBypkid(Long pkid);
}
