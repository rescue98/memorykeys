package com.ufro.pa_mk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/registroCuenta")
    public String registroCuenta(){
        return "registroCuenta";
    }

}
