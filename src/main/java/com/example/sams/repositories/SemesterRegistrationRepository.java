package com.example.sams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sams.model.SemesterRegistration;

public interface SemesterRegistrationRepository extends JpaRepository<SemesterRegistration, Long> {
    SemesterRegistration getBysemesterID(Long semesterID);
}
