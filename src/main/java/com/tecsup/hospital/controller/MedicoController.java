package com.tecsup.hospital.controller;

import com.tecsup.hospital.model.Medico;
import com.tecsup.hospital.service.MedicoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medicos")
@CrossOrigin(origins = "*")
public class MedicoController {

    private final MedicoService service;

    public MedicoController(MedicoService service) {
        this.service = service;
    }

    // 🔹 Listar todos los médicos
    @GetMapping
    public List<Medico> listar() {
        return service.listar();
    }

    // 🔹 Crear un nuevo médico
    @PostMapping
    public Medico crear(@RequestBody Medico m) {
        return service.crear(m);
    }

    // 🔹 Buscar médico por ID (Mongo usa String)
    @GetMapping("/{id}")
    public Medico buscar(@PathVariable String id) {
        return service.buscar(id);
    }

    // 🔹 Actualizar médico existente
    @PutMapping("/{id}")
    public Medico actualizar(@PathVariable String id, @RequestBody Medico m) {
        return service.actualizar(id, m);
    }

    // 🔹 Eliminar médico por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}
