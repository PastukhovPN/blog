package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home1(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home1";
    }

    @GetMapping("/about")
    public String blogMain(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }
}
