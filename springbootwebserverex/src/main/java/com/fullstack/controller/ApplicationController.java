package com.fullstack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("WELCOME TO FULL STACK JAVA DEVELOPER, PUNE");
    }

    @GetMapping("/address")
    public ResponseEntity<String> sayAddress() {
        return ResponseEntity.ok("PUNE, MH, INDIA");
    }
}
