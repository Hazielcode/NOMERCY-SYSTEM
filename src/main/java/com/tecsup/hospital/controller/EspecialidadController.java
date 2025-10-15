package com.tecsup.hospital.controller;

import com.tecsup.hospital.model.Especialidad;
import com.tecsup.hospital.service.EspecialidadService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
@CrossOrigin(origins = "*")
public class EspecialidadController {

    private final EspecialidadService service;

    public EspecialidadController(EspecialidadService service) {
        this.service = service;
    }

    // Listar todas las especialidades
    @GetMapping
    public List<Especialidad> listar() {
        return service.listar();
    }

    // Crear una nueva especialidad
    @PostMapping
    public Especialidad crear(@RequestBody Especialidad e) {
        return service.crear(e);
    }

    // Buscar especialidad por ID
    @GetMapping("/{id}")
    public Especialidad buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    // Actualizar especialidad existente
    @PutMapping("/{id}")
    public Especialidad actualizar(@PathVariable Long id, @RequestBody Especialidad e) {
        return service.actualizar(id, e);
    }

    // Eliminar especialidad
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
