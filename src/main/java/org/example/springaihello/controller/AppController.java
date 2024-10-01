package org.example.springaihello.controller;

import org.example.springaihello.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

@GetMapping("/chat")
public String hello(@RequestParam(defaultValue = "World") String subject,
                    @RequestParam(defaultValue = "Friendly") String tone,
                    @RequestParam(defaultValue = "message") String message) {
    return appService.generateChat(subject, tone, message);
}
}
