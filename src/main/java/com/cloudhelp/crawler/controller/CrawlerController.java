package com.cloudhelp.crawler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/crawler")
public class CrawlerController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "CloudhelpCrawler1");
        response.put("timestamp", LocalDateTime.now());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/info")
    public ResponseEntity<Map<String, Object>> getInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("serviceName", "CloudhelpCrawler1");
        response.put("version", "1.0.0");
        response.put("description", "A simple Spring Boot microservice for web crawling");
        response.put("timestamp", LocalDateTime.now());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/crawl")
    public ResponseEntity<Map<String, Object>> crawl(@RequestBody Map<String, String> request) {
        String url = request.get("url");
        
        // Simple response for now - in real implementation, this would perform actual crawling
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Crawl request received");
        response.put("url", url);
        response.put("status", "PROCESSING");
        response.put("timestamp", LocalDateTime.now());
        
        return ResponseEntity.ok(response);
    }
} 