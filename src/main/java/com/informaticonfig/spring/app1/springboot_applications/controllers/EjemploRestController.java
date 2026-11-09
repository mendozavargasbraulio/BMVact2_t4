package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 

public class EjemploRestController {
    @GetMapping("/detalles_info2")

    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "English Lab");
        respuesta.put("Estudiante", "Braulio");
        respuesta.put("Nivel", "B1");
        return respuesta;
    }

    @GetMapping("/proyecto")
    public String proyecto() {
        return "Proyecto Spring Boot - CSDM";
    }
}
