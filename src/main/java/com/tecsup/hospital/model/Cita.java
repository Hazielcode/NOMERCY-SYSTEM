package com.tecsup.hospital.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "citas")
public class Cita {

    @Id
    private String id;

    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private EstadoCita estado = EstadoCita.PROGRAMADA;

    // 🔹 Referencias a otros documentos (relaciones ligeras)
    @DBRef
    private Paciente paciente;

    @DBRef
    private Medico medico;
}
