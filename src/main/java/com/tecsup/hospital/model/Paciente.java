package com.tecsup.hospital.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String correo;
    private String direccion;
}
