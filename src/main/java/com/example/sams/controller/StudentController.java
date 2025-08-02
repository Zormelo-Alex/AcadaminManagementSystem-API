package com.example.sams.controller;

import com.example.sams.dto.StudentAddRequest;
import com.example.sams.model.Student;
import com.example.sams.model.StudentProgrammes;
import com.example.sams.model.User;
import com.example.sams.services.StudentService;
import com.example.sams.services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/student")
@Tag(name = "Students", description = "Student APIs")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private UserService userService;

    @PostMapping("/addStudent")
    public ResponseEntity<?> createStudent(@RequestBody StudentAddRequest request) {
        try {
            Student student = new Student();
            student.setStudentID(request.getStudentID());
            student.setEmailAddress(request.getEmailAddress());
            student.setCreatedate(new Date());
            student.setDob(new Date());
            student.setStudentIDOld(request.getStudentIDOld());
            student.setFirstName(request.getFirstName());
            student.setLastName(request.getLastName());
            student.setGroupID(request.getGroupID());

            Student createdStudent = studentService.addStudent(student);
            return ResponseEntity.status(200).body(Map.of("status", true,
                    "type", "student.create",
                    "message", "Student Created",
                    "student", createdStudent
            ));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.create.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/allStudents")
    public ResponseEntity<?> getAllStudentsDetailed(HttpServletRequest request) {
        try {
            List<Student> response = studentService.getAllUsers();
            return ResponseEntity.status(200).body(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "students.get.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/students")
    public ResponseEntity<?> getAllStudentsBasic(HttpServletRequest request) {
        try {
            List<Student> response = studentService.getAllUsers();
            return ResponseEntity.ok(response);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.get.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable String id) {
        try {
            Student student = studentService.findStudentById(id);
            if (student == null) {
                return ResponseEntity.notFound().build(); // 404 Not Found
            }
            return ResponseEntity.ok(student);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.get.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable String id, @RequestBody StudentAddRequest studentAddRequest) {
        try {
            Student existingStudent = studentService.findStudentById(id);
            if (existingStudent == null) {
                return ResponseEntity.notFound().build();
            }
            existingStudent.setStudentID(studentAddRequest.getStudentID());
            existingStudent.setEmailAddress(studentAddRequest.getEmailAddress());
            existingStudent.setLastupdated(new Date());
            existingStudent.setDob(studentAddRequest.getDob());
            existingStudent.setStudentIDOld(studentAddRequest.getStudentIDOld());
            existingStudent.setFirstName(studentAddRequest.getFirstName());
            existingStudent.setLastName(studentAddRequest.getLastName());
            existingStudent.setGroupID(studentAddRequest.getGroupID());


            Student updatedStudent = studentService.updateStudent(existingStudent);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "student.updated",
                    "updatedStudent", updatedStudent));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.update.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchStudent(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.search.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/deferProgramme")
    public ResponseEntity<String> getDeferedStudents(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/deferProgramme/{id}")
    public ResponseEntity<?> defereStudent(@PathVariable Long id) {
        try {
            StudentProgrammes existingStudent = studentService.findStudentProgrammesById(id);
            if (existingStudent == null) {
                return ResponseEntity.status(500).body(Map.of(
                        "status", false,
                        "type", "student.defer.error",
                        "message", "Student not found"));
            }
            existingStudent.setCompletionStatus(4);
            StudentProgrammes updatedStudent = studentService.updateStudentProgrammes(existingStudent);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "student.updated.defered",
                    "updatedStudent", updatedStudent));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.defer.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/undeferProgramme/{id}")
    public ResponseEntity<?> undefereStudent(@PathVariable Long id) {
        try {
            StudentProgrammes existingStudent = studentService.findStudentProgrammesById(id);
            if (existingStudent == null) {
                return ResponseEntity.status(500).body(Map.of(
                        "status", false,
                        "type", "student.undefer.error",
                        "message", "Student not found"));
            }
            existingStudent.setCompletionStatus(1);
            StudentProgrammes updatedStudent = studentService.updateStudentProgrammes(existingStudent);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "student.updated.undefered",
                    "updatedStudent", updatedStudent));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.undefer.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/withdrawStudent/{id}")
    public ResponseEntity<?> withdrawStudent(@PathVariable Long id) {
        try {
            StudentProgrammes existingStudent = studentService.findStudentProgrammesById(id);
            if (existingStudent == null) {
                return ResponseEntity.status(500).body(Map.of(
                        "status", false,
                        "type", "student.withdraw.error",
                        "message", "Student not found"));
            }
            //update User accountDissabled
            User existingUser = userService.findUserByUsername(existingStudent.getStudentId());
            existingUser.setAccountDisabled(true);
            existingStudent.setCompletionStatus(4);
            StudentProgrammes updatedStudent = studentService.updateStudentProgrammes(existingStudent);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "student.updated.withdrawn",
                    "updatedStudent", updatedStudent));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.withdraw.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/activateStudent/{id}")
    public ResponseEntity<?> activateStudent(@PathVariable Long id) {
        try {
            StudentProgrammes existingStudent = studentService.findStudentProgrammesById(id);
            if (existingStudent == null) {
                return ResponseEntity.status(500).body(Map.of(
                        "status", false,
                        "type", "student.activate.error",
                        "message", "Student not found"));
            }
            //update User accountDissabled
            User existingUser = userService.findUserByUsername(existingStudent.getStudentId());
            existingUser.setAccountDisabled(false);
            userService.updateUser(existingUser);
            existingStudent.setCompletionStatus(1);
            StudentProgrammes updatedStudent = studentService.updateStudentProgrammes(existingStudent);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "type", "student.updated.activated",
                    "updatedStudent", updatedStudent));
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "student.activate.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/removeStudent/{id}")
    public ResponseEntity<String> removeStudent(@PathVariable String id) {
        try {
            return ResponseEntity.ok(" Coming Soon..." + id);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/disableAllStudents")
    public ResponseEntity<String> disableAllStudents(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
