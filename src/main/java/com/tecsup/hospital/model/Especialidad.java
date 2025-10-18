package com.tecsup.hospital.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

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

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("especialidad")  // 👈 rompe el bucle inverso
    private List<Medico> medicos;
}
