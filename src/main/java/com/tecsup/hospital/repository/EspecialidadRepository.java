package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Especialidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends MongoRepository<Especialidad, String> {

    // 🔹 Ejemplo de consulta personalizada (opcional):
    // Especialidad findByNombre(String nombre);
}
