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

    public List<Medico> listar() {
        return repo.findAll();
    }

    public Medico crear(Medico m) {
        return repo.save(m);
    }

    public Medico buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Medico actualizar(Long id, Medico m) {
        m.setId(id);
        return repo.save(m);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
