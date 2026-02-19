package com.animahub.javabeans.ia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {
    
    @GetMapping("/health")
    public String health() {
        return "Game is running!";
    }
    
    @GetMapping("/cenario")
    public String cenario() {
        return "Primeiro cenário de teste";
    }
}