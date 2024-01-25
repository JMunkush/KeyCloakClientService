package io.munkush.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    @GetMapping("/user")
    public ResponseEntity<String> user(){
        return ResponseEntity.ok("successfully");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin(){
        return ResponseEntity.ok("successfully");
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok("successfully");
    }

}
