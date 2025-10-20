package com.tecsup.hospital.controller;

import com.tecsup.hospital.model.Paciente;
import com.tecsup.hospital.service.PacienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
@CrossOrigin(origins = "*")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    // 🔹 Listar todos los pacientes
    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }

    // 🔹 Crear un nuevo paciente
    @PostMapping
    public Paciente crear(@RequestBody Paciente p) {
        return service.crear(p);
    }

    // 🔹 Buscar paciente por ID (MongoDB usa String)
    @GetMapping("/{id}")
    public Paciente buscar(@PathVariable String id) {
        return service.buscar(id);
    }

    // 🔹 Actualizar un paciente existente
    @PutMapping("/{id}")
    public Paciente actualizar(@PathVariable String id, @RequestBody Paciente p) {
        return service.actualizar(id, p);
    }

    // 🔹 Eliminar paciente por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}
