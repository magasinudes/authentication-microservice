package com.magasinudes.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @RequestMapping("/health")
    public String health() {
        return "ok";
    }
}