package com.tecsup.hospital.repository;

import com.tecsup.hospital.model.Auditoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditoriaRepository extends MongoRepository<Auditoria, String> {
}
