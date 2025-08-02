package com.example.sams.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SMSservice {
    @Value("${smsonline.api_key}")
    private String apiKey;

    @Value("${smsonline.sender_id}")
    private String senderId;

    @Value("${smsonline.api_url}")
    private String apiUrl;

    public String sendSms(String to, String message) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            String fullUrl = UriComponentsBuilder.fromHttpUrl(apiUrl)
                    .queryParam("apikey", apiKey)
                    .queryParam("from", senderId)
                    .queryParam("to", to)
                    .queryParam("text", message)
                    .toUriString();

            return restTemplate.getForObject(fullUrl, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send SMS: " + e.getMessage();
        }
    }
}
