package com.abc.microservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that handles greeting-related endpoints.
 */
@RestController
@Tag(name = "Greeting Controller", description = "APIs for greeting and homepage")
public class GreetingController {

    @Operation(summary = "Homepage message")
    @GetMapping("/")
    public String home() {
        return "Welcome to the Spring Boot Microservice!";
    }

    @Operation(summary = "Get a simple greeting message")
    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello, World!";
    }
}
