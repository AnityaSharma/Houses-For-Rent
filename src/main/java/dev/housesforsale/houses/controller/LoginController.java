package dev.housesforsale.houses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping( value = "/login")
    public String login(){
        return "index";
    }
}
