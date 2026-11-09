package com.informaticonfig.spring.app1.springboot_applications.controllers;

import com.informaticonfig.spring.app1.springboot_applications.models.dto.EmpleadoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormularioController {

    @Value("${config.usuario}")
    private String usuario;

    @GetMapping("/empleados/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new EmpleadoDTO());
        model.addAttribute("usuarioProyecto", usuario);
        return "formulario";
    }

    @PostMapping("/empleados/registrar")
    public String registrarEmpleado(@ModelAttribute("empleado") EmpleadoDTO empleado,
                                   Model model) {
        model.addAttribute("empleado", empleado);
        model.addAttribute("usuarioProyecto", usuario);
        model.addAttribute("guardado", true);
        return "formulario";
    }
}
