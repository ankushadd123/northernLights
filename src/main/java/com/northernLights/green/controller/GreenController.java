package com.northernLights.green.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
        @RequestMapping
public class GreenController {

    @GetMapping("/api")
    public String checkService(){
        return "hello there";
    }
}
