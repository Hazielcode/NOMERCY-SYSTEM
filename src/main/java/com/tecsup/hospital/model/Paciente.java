package com.tecsup.hospital.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "pacientes")
public class Paciente {

    @Id
    private String id;

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String correo;
    private String direccion;
}
