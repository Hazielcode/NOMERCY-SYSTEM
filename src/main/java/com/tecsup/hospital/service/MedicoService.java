package com.tecsup.hospital.service;

import com.tecsup.hospital.model.Medico;
import com.tecsup.hospital.repository.MedicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository repo;

    public MedicoService(MedicoRepository repo) {
        this.repo = repo;
    }

    // 🔹 Listar todos los médicos
    public List<Medico> listar() {
        return repo.findAll();
    }

    // 🔹 Crear un nuevo médico
    public Medico crear(Medico m) {
        return repo.save(m);
    }

    // 🔹 Buscar médico por ID (MongoDB usa String)
    public Medico buscar(String id) {
        return repo.findById(id).orElse(null);
    }

    // 🔹 Actualizar médico existente
    public Medico actualizar(String id, Medico m) {
        m.setId(id);
        return repo.save(m);
    }

    // 🔹 Eliminar médico
    public void eliminar(String id) {
        repo.deleteById(id);
    }
}
