package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends MongoRepository<Paciente, String> {

    // 🔹 Consultas personalizadas opcionales:
    // Paciente findByDni(String dni);
    // List<Paciente> findByApellido(String apellido);
}
