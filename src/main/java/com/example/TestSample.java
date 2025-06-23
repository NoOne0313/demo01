package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestSample {

    // Rule 1: avoid-system-out
    public void logSomething() {
        System.out.println("This is debug output");
    }

    // Rule 2: missing-preauthorize
    @GetMapping("/data")
    public String getData() {
        return "data";
    }

    // Rule 3: password-in-requestbody
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        String password = request.getPassword();
        return "ok";
    }
}

class LoginRequest {
    private String password;
    public String getPassword() {
        return password;
    }
}
