package com.tecsup.hospital.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    @JsonIgnoreProperties("medicos")   // 👈 rompe la recursión infinita
    private Especialidad especialidad;
}
