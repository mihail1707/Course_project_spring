package com.example.Course_project_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {
    @GetMapping("/books")
    public String books(Model model){
      return "books";
    };
}
