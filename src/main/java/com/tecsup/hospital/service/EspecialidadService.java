package com.tecsup.hospital.service;

import com.tecsup.hospital.model.Especialidad;
import com.tecsup.hospital.repository.EspecialidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadService {

    private final EspecialidadRepository repo;

    public EspecialidadService(EspecialidadRepository repo) {
        this.repo = repo;
    }

    // Listar todas las especialidades
    public List<Especialidad> listar() {
        return repo.findAll();
    }

    // Crear una nueva especialidad
    public Especialidad crear(Especialidad e) {
        return repo.save(e);
    }

    // Buscar una especialidad por ID
    public Especialidad buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Actualizar una especialidad existente
    public Especialidad actualizar(Long id, Especialidad e) {
        e.setId(id);
        return repo.save(e);
    }

    // Eliminar especialidad
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
