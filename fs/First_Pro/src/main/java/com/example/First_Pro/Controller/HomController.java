package com.example.First_Pro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomController {
    @RequestMapping
public String Home(){
    return "home";
}
}
