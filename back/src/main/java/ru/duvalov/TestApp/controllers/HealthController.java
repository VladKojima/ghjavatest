package ru.duvalov.TestApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping(path = "/health")
    public ResponseEntity<Void> check(){
        int a = 10;
        return ResponseEntity.ok().build();
    }
}
