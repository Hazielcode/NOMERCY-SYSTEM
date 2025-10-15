package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
