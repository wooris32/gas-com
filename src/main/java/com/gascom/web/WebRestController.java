package com.gascom.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WebRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello1";
    }
}