package com.tecsup.hospital.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String dni;
    private String cmp;
    private String telefono;
    private String correo;
}
