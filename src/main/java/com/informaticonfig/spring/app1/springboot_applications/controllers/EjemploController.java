package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller 

public class EjemploController {
    @GetMapping("/detalles_info")

    public String info(Map<String, Object> modelo){
        modelo.put("Titulo", "English Lab");
        modelo.put("Servidor", "Proyecto de prograweb");
        modelo.put("Puerto", "8082");
        return "detalles_info";
    }
}
