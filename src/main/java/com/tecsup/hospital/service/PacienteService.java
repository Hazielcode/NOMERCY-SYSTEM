package com.tecsup.hospital.service;

import com.tecsup.hospital.model.Paciente;
import com.tecsup.hospital.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repo;

    public PacienteService(PacienteRepository repo) {
        this.repo = repo;
    }

    public List<Paciente> listar() {
        return repo.findAll();
    }

    public Paciente crear(Paciente p) {
        return repo.save(p);
    }

    public Paciente buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Paciente actualizar(Long id, Paciente p) {
        p.setId(id);
        return repo.save(p);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
