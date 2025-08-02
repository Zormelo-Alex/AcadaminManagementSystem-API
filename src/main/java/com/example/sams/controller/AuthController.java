package com.example.sams.controller;

import com.example.sams.dto.LoginRequest;
import com.example.sams.dto.LoginResponse;
import com.example.sams.model.User;
import com.example.sams.repositories.UserRepository;
import com.example.sams.services.JWTService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
@Tag(name = "Auth", description = "Authentication APIs")
public class AuthController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private JWTService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        try {
            User user = userRepository.findByUsername(request.getUsername());

            if (user == null) {
                throw new RuntimeException("User not found");
            }

            if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
                throw new RuntimeException("Invalid password");
            }

            String token = jwtService.generateToken(user);
            return ResponseEntity.ok(new LoginResponse(token, user));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request) {
        try {
            String authHeader = request.getHeader("Authorization");

            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
            }


            String token = authHeader.substring(7);

            String username = jwtService.extractUserName(token);

            return ResponseEntity.ok("User " + username + " logged out successfully");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @PutMapping("/resetUserPassword")
    public ResponseEntity<String> resetUserPassword(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/resetPasswords")
    public ResponseEntity<String> resetAllPasswords(HttpServletRequest request) {
        try {
            return ResponseEntity.ok(" Coming Soon...");
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

