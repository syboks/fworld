package com.syboks.fworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
    @GetMapping("/")
    public String hello(Model model) {
        return "hello5";
    }

}
