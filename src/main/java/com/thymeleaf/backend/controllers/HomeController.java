package com.thymeleaf.backend.controllers;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

        @GetMapping("/")
        public String home(@RequestParam(name="showDetails", required = false) boolean showDetails, Model model) {
            model.addAttribute("features", Arrays.asList(
                "List item 1",
                "I stg if it doesn't work",
                "I may die"
            ));
            model.addAttribute("showDetails", showDetails);
            return "index";
        }
}
