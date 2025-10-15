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

    @GetMapping
    public List<Medico> listar() {
        return service.listar();
    }

    @PostMapping
    public Medico crear(@RequestBody Medico m) {
        return service.crear(m);
    }

    @GetMapping("/{id}")
    public Medico buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Medico actualizar(@PathVariable Long id, @RequestBody Medico m) {
        return service.actualizar(id, m);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
