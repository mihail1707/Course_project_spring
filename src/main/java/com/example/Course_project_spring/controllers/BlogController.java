package com.example.Course_project_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BlogController {
    @GetMapping("/blog")
    public String blogMain(Model model){
        return "blog-main";
    }
}
