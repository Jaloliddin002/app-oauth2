package com.google.appoauth2.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "Hello";
    }

    @GetMapping("/account")
    public ResponseEntity<?> getAccount(Principal principal) {
        return ResponseEntity.ok(principal);

    }

}
