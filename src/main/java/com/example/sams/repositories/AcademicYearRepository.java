package com.example.sams.repositories;

import com.example.sams.model.AcademicYears;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicYearRepository extends JpaRepository<AcademicYears, Long> {
    AcademicYears getByacademicYear(String academicYear);
}
