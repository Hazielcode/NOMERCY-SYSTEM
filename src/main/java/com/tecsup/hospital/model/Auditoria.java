package com.tecsup.hospital.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "auditorias")
public class Auditoria {

    @Id
    private String id;
    private String clase;
    private String metodo;
    private LocalDateTime fecha;

    public Auditoria(String clase, String metodo) {
        this.clase = clase;
        this.metodo = metodo;
        this.fecha = LocalDateTime.now();
    }

    // Getters y setters opcionales (o usa Lombok si prefieres)
    public String getId() { return id; }
    public String getClase() { return clase; }
    public String getMetodo() { return metodo; }
    public LocalDateTime getFecha() { return fecha; }
}
