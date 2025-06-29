package ru.asteises.auth.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Value("${db.username}")
    private String dbUsername;


    @GetMapping("/db-username")
    public String getTestPathSecret() {
        return dbUsername;
    }
}
