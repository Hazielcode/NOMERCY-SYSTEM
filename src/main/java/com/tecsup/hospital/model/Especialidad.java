package com.tecsup.hospital.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "especialidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;       // único en BD
    private String descripcion;  // opcional
}
