package com.example.Course_project_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/contact")
    public String contact( Model model) {
        model.addAttribute("title", "Контакты");
        return "contact";
    }
    @GetMapping("/user-detail")
    public String userDetail(@RequestParam("Id") String Id, Model model) {
        // Здесь вы можете использовать email для фильтрации данных из базы данных
        // Например, получаем пользователя по email из репозитория и добавляем в модель
        // User user = userService.findByEmail(email);
        model.addAttribute("Id", Id);
        // model.addAttribute("user", user); // Добавьте пользователя в модель, если нужно
        return "user-detail"; // Имя шаблона для отображения информации о пользователе
    }
}