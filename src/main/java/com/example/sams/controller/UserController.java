package com.example.sams.controller;


import com.example.sams.dto.RegisterRequest;
import com.example.sams.dto.UpdatePasswordDTO;
import com.example.sams.model.Tutor;
import com.example.sams.model.User;
import com.example.sams.services.SMSservice;
import com.example.sams.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private SMSservice smSservice;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        try {
            List<User> respose = userService.getAllUsers();
            return ResponseEntity.status(200).body(respose);
        }catch (RuntimeException e){
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "user.get.error",
                    "message", e.getMessage()));
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest request) {
        try {
            User user = new User();
            user.setUsername(request.getUsername());
            user.setPassword(request.getPassword());
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());
            user.setEmailAddress(request.getEmailAddress());
            user.setMobile(request.getMobile());
            user.setPhone(request.getPhone());
            user.setAccountType(request.getAccountType());
            user.setCreateDate(null);


            User createdUser = userService.registerUser(user);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "CreatedUser", createdUser));
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "user.create.error",
                    "message", e.getMessage()));
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getSingleUser(@PathVariable Long id) {
        try {
            User user = userService.findUserById(id);
            if (user == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.status(200).body(user);
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "user.get.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/userUpdate/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody RegisterRequest request) {
        try {
            User existingUser = userService.findUserById(id);
            if (existingUser == null) {
                return ResponseEntity.status(500).body(Map.of(
                        "status", false,
                        "type", "user.get.error",
                        "message", "User not found!"));
            }
            existingUser.setUsername(request.getUsername());
            existingUser.setPassword(request.getPassword());
            existingUser.setFirstName(request.getFirstName());
            existingUser.setLastName(request.getLastName());
            existingUser.setEmailAddress(request.getEmailAddress());
            existingUser.setMobile(request.getMobile());
            existingUser.setPhone(request.getPhone());
            existingUser.setAccountType(request.getAccountType());
            existingUser.setCreateDate(null);


            User createdUser = userService.updateUser(existingUser);
            return ResponseEntity.status(200).body(Map.of(
                    "status", true,
                    "updatedUser", createdUser));
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "user.update.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/updatePassword")
    public ResponseEntity<?> updateUserPassword(HttpServletRequest httpServletRequest, @RequestBody UpdatePasswordDTO request) {
        try {
            String username = httpServletRequest.getUserPrincipal().getName();
            User existingUser = userService.findUserByUsername(username);

            if (existingUser == null) {
                throw new RuntimeException("User not found");
            }
            if (!passwordEncoder.matches(request.getOldPassword(), existingUser.getPassword())) {
                throw new RuntimeException("Invalid password");
            }

            String hashedPassword = passwordEncoder.encode(request.getNewPassword());
            existingUser.setPassword(hashedPassword);
            userService.updateUser(existingUser);
            return ResponseEntity.ok(Map.of(
                    "status", true,
                    "message", "Password updated successfully"));
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "user.update.error",
                    "message", e.getMessage()));
        }
    }

    @PutMapping("/updatePasswordPer")
    public ResponseEntity<?> userUpdatePassword(HttpServletRequest httpServletRequest, @RequestBody UpdatePasswordDTO request) {
        try {
            String username = httpServletRequest.getUserPrincipal().getName();
            User existingUser = userService.findUserByUsername(username);

            if (existingUser == null) {
                throw new RuntimeException("User not found");
            }
            if (!passwordEncoder.matches(request.getOldPassword(), existingUser.getPassword())) {
                throw new RuntimeException("Invalid password");
            }

            String hashedPassword = passwordEncoder.encode(request.getNewPassword());
            existingUser.setPassword(hashedPassword);
            userService.updateUser(existingUser);
            return ResponseEntity.ok(Map.of(
                    "status", true,
                    "message", "Password updated successfully"));
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "user.update.error",
                    "message", e.getMessage()));
        }
    }

    @PostMapping("/sendCredentials")
    public ResponseEntity<?> sendCredentials(HttpServletRequest request) {
        try {
            String result = smSservice.sendSms("0553926202", "Hello Alex");
            System.out.println(result);
            return ResponseEntity.ok(result);
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(Map.of(
                    "status", false,
                    "type", "Credentials.send.error",
                    "message", e.getMessage()));
        }
    }
}
