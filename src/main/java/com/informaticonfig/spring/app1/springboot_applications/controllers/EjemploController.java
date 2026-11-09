
package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {

        Empleados empleado1 = new Empleados(
            "Braulio",
            "Mendoza",
            "Santa Lucia",
            "Estudiante",
            21,
            12345678,
            1
        );

        model.addAttribute("Titulo", "Información del Empleado");
        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados() {

        return Arrays.asList(
            new Empleados("María", "Perez", "Calle segunda no.2",
                "Secretaria", 20, 123654987, 2),

            new Empleados("Juan", "Rodriguez", "Calle primera no.1",
                "Gerente", 35, 123456789, 1),

            new Empleados("Luis", "Martinez", "Calle tercera no.3",
                "Contador", 28, 987654321, 3),

            new Empleados("Ana", "Gonzalez", "Avenida central no.4",
                "Diseñadora", 30, 456789123, 4),

            new Empleados("Pedro", "Sanchez", "Boulevard no.5",
                "Analista", 25, 789123456, 5)
        );
    }
}
