package com.tecsup.hospital.controller;

import com.tecsup.hospital.model.Cita;
import com.tecsup.hospital.service.CitaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/citas")
@CrossOrigin(origins = "*")
public class CitaController {

    private final CitaService service;

    public CitaController(CitaService service) {
        this.service = service;
    }

    // 🔹 Listar todas las citas
    @GetMapping
    public List<Cita> listar() {
        return service.listar();
    }

    // 🔹 Crear una nueva cita
    @PostMapping
    public Cita crear(@RequestBody Cita c) {
        return service.crear(c);
    }

    // 🔹 Buscar cita por ID (ahora String)
    @GetMapping("/{id}")
    public Cita buscar(@PathVariable String id) {
        return service.buscar(id);
    }

    // 🔹 Actualizar cita existente (ID tipo String)
    @PutMapping("/{id}")
    public Cita actualizar(@PathVariable String id, @RequestBody Cita c) {
        return service.actualizar(id, c);
    }

    // 🔹 Eliminar cita (ID tipo String)
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}
