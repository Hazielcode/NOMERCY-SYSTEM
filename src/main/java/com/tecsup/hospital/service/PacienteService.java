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

    // 🔹 Listar todos los pacientes
    public List<Paciente> listar() {
        return repo.findAll();
    }

    // 🔹 Crear un nuevo paciente
    public Paciente crear(Paciente p) {
        return repo.save(p);
    }

    // 🔹 Buscar paciente por ID (String para MongoDB)
    public Paciente buscar(String id) {
        return repo.findById(id).orElse(null);
    }

    // 🔹 Actualizar un paciente existente
    public Paciente actualizar(String id, Paciente p) {
        p.setId(id);
        return repo.save(p);
    }

    // 🔹 Eliminar paciente por ID
    public void eliminar(String id) {
        repo.deleteById(id);
    }
}
