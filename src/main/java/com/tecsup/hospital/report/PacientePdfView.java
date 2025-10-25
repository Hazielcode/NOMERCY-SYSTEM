package com.tecsup.hospital.report;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import com.tecsup.hospital.model.Paciente;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PacientePdfView {

    public void export(List<Paciente> pacientes, HttpServletResponse response)
            throws IOException, DocumentException {

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=pacientes.pdf");

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();

        // 🔹 Título del reporte
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
        Paragraph title = new Paragraph("🏥 Reporte de Pacientes", fontTitle);
        title.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(title);
        document.add(new Paragraph(" ")); // espacio

        // 🔹 Tabla con encabezados
        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100);
        table.addCell("Nombre");
        table.addCell("Apellido");
        table.addCell("DNI");
        table.addCell("Teléfono");
        table.addCell("Correo");

        // 🔹 Rellenar la tabla con los datos
        for (Paciente p : pacientes) {
            table.addCell(p.getNombre());
            table.addCell(p.getApellido());
            table.addCell(p.getDni());
            table.addCell(p.getTelefono());
            table.addCell(p.getCorreo());
        }

        document.add(table);
        document.close();
    }
}
