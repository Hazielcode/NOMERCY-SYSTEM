package com.tecsup.hospital.service;

import com.tecsup.hospital.model.Cita;
import com.tecsup.hospital.repository.CitaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitaService {

    private final CitaRepository repo;

    public CitaService(CitaRepository repo) {
        this.repo = repo;
    }

    // Listar todas las citas
    public List<Cita> listar() {
        return repo.findAll();
    }

    // Crear una nueva cita
    public Cita crear(Cita c) {
        return repo.save(c);
    }

    // Buscar una cita por ID
    public Cita buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Actualizar una cita existente
    public Cita actualizar(Long id, Cita c) {
        c.setId(id);
        return repo.save(c);
    }

    // Eliminar cita
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
