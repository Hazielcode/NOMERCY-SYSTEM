package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends MongoRepository<Cita, String> {

    // Puedes agregar consultas personalizadas si lo necesitas, por ejemplo:
    // List<Cita> findByEstado(String estado);
    // List<Cita> findByPaciente_Id(String pacienteId);
}
