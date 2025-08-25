package com.unipass.unipass_manager_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "API funcionando!";
    }

    @GetMapping("/health")
    public String health() {
        return "Sistema online";
    }
}