package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kec")
public class KecController {
    @GetMapping("/msc")
    public String kec() {
        return "welcome to kec - By Akash....";
    }
}