package com.tecsup.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/view/pacientes")
    public String pacientes() {
        return "pacientes";
    }

    @GetMapping("/view/medicos")
    public String medicos() {
        return "medicos";
    }

    @GetMapping("/view/especialidades")
    public String especialidades() {
        return "especialidades";
    }

    @GetMapping("/view/citas")
    public String citas() {
        return "citas";
    }
}
