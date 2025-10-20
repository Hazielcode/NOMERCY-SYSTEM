package com.tecsup.hospital.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "especialidades")
public class Especialidad {

    @Id
    private String id;

    private String nombre;
    private String descripcion;

    // 🔹 Referencia inversa a médicos (opcional)
    @DBRef(lazy = true)
    private List<Medico> medicos;
}
