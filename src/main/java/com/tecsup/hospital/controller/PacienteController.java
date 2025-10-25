package com.tecsup.hospital.controller;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.tecsup.hospital.model.Paciente;
import com.tecsup.hospital.service.PacienteService;
import com.tecsup.hospital.report.PacienteExcelView;
import com.tecsup.hospital.report.PacientePdfView;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pacientes")
@CrossOrigin(origins = "*")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    // 🔹 Listar todos los pacientes
    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }

    // 🔹 Crear un nuevo paciente
    @PostMapping
    public Paciente crear(@RequestBody Paciente p) {
        return service.crear(p);
    }

    // 🔹 Buscar paciente por ID
    @GetMapping("/{id}")
    public Paciente buscar(@PathVariable String id) {
        return service.buscar(id);
    }

    // 🔹 Actualizar un paciente existente
    @PutMapping("/{id}")
    public Paciente actualizar(@PathVariable String id, @RequestBody Paciente p) {
        return service.actualizar(id, p);
    }

    // 🔹 Eliminar paciente
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }

    // 📊 Exportar reporte en Excel
    @GetMapping("/reporte/excel")
    public void generarExcel(HttpServletResponse response) throws IOException {
        List<Paciente> pacientes = service.listar();
        new PacienteExcelView().export(pacientes, response);
    }

    // 📄 Exportar reporte en PDF
    @GetMapping("/reporte/pdf")
    public void generarPdf(HttpServletResponse response) throws IOException, com.lowagie.text.DocumentException {
        List<Paciente> pacientes = service.listar();
        new PacientePdfView().export(pacientes, response);
    }

}
