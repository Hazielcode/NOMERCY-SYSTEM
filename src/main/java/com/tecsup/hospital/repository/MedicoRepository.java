package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
