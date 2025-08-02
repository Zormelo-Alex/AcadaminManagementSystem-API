package com.example.sams.controller;


import com.example.sams.dto.RegisterRequest;
import com.example.sams.model.User;
import com.example.sams.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
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
            return ResponseEntity.ok(createdUser);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getSingleUser(@PathVariable String id) {
        try {
            // You can now use the `id` variable
            return ResponseEntity.ok("Coming Soon for user: " + id);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/userUpdate/{id}")
    public ResponseEntity<String> updateUser(@PathVariable String id) {
        try {
            // You can now use the `id` variable
            return ResponseEntity.ok("Coming Soon for user: " + id);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/updatePassword")
    public ResponseEntity<String> updateUserPassword(HttpServletRequest request) {
        try {
            // You can now use the `id` variable
            return ResponseEntity.ok("Coming Soon for user: ");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/updatePasswordPer")
    public ResponseEntity<String> userUpdatePassword(HttpServletRequest request) {
        try {
            // You can now use the `id` variable
            return ResponseEntity.ok("Coming Soon for user: ");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/sendCredentials/{id}")
    public ResponseEntity<String> sendCredentials(HttpServletRequest request) {
        try {
            // You can now use the `id` variable
            return ResponseEntity.ok("Coming Soon for user: ");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
