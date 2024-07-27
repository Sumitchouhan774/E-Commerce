package com.sam.ecomm_part2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/api/")
    public String health() {
        return "Health is ok";
    }
}
