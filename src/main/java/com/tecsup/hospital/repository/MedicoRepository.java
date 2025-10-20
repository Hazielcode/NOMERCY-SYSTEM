package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, String> {

    // 🔹 Consultas personalizadas opcionales:
    // List<Medico> findByEspecialidad_Nombre(String nombre);
    // Medico findByDni(String dni);
}
