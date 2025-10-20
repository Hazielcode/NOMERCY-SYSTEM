package com.tecsup.hospital.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "medicos")
public class Medico {

    @Id
    private String id;

    private String nombre;
    private String apellido;
    private String dni;
    private String cmp;
    private String telefono;
    private String correo;

    // 🔹 Referencia a la especialidad (relación simple)
    @DBRef
    private Especialidad especialidad;
}
