package com.example.sams;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Tag(name = "HealthCheck", description = "Health Check APIs")
public class HealthController {

    @GetMapping("/api/healthCheck")
    public Map<String, Object> index(){
        return Map.of(
                "status", true,
                "message", "SAMS API service is up and running...",
                "author", "DOM"
        );
    }
}
