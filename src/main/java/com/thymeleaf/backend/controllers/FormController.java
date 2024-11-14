package com.thymeleaf.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    // Display the form (GET request)
    @GetMapping("/login")
    public String showForm() {
        return "login";  // This will point to form.html in the resources/templates folder
    }

    // Handle form submission (POST request)
    @PostMapping("/submit")
    public String handleSubmit(@RequestParam String name, @RequestParam String email, Model model) {
        
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        System.out.println(model);
        return "data";  // This will point to result.html in the resources/templates folder
    }
}
