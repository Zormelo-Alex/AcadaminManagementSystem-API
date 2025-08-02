package com.example.sams.repositories;

import com.example.sams.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends JpaRepository<Semester, Long> {
    Semester getBysemesterName(String semesterName);
}
