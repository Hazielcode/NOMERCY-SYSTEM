package com.tecsup.hospital.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "cita")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;

    @Enumerated(EnumType.STRING)
    private EstadoCita estado = EstadoCita.PROGRAMADA;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    @JsonIgnoreProperties({"citas"}) // 👈 evita recursión infinita con paciente
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    @JsonIgnoreProperties({"citas", "especialidad"}) // 👈 evita bucles con médico y especialidad
    private Medico medico;
}
