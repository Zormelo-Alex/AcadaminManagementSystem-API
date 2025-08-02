package com.example.sams.services;

import com.example.sams.model.Student;
import com.example.sams.model.StudentProgrammes;
import com.example.sams.repositories.StudentProgrammesRepository;
import com.example.sams.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentProgrammesRepository studentProgrammesRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<Student> getAllUsers() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        if (studentRepository.findBystudentID(student.getStudentID()) != null) {
            throw new RuntimeException("Student with same ID already exists");
        }
        student.setPkID(null);
        return studentRepository.save(student);
    }

    public Student findStudentById(String id) {
        return studentRepository.findBystudentID(id);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public StudentProgrammes findStudentProgrammesById(Long id) {
        return studentProgrammesRepository.findBypkid(id);
    }

    public StudentProgrammes updateStudentProgrammes(StudentProgrammes studentProgrammes) {
        return studentProgrammesRepository.save(studentProgrammes);
    }
}
