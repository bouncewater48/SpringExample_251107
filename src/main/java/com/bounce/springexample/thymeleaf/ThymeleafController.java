package com.bounce.springexample.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf/ex01")
    public String ex01() {
        return "thymeleaf/ex01";
    }

}
