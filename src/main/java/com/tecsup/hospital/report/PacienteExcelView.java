package com.tecsup.hospital.report;

import com.tecsup.hospital.model.Paciente;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class PacienteExcelView {

    public void export(List<Paciente> pacientes, HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=pacientes.xlsx");

        // 🔹 Crear el libro de Excel
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Pacientes");

        // 🔹 Estilo del encabezado
        CellStyle headerStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);
        font.setColor(IndexedColors.WHITE.getIndex());
        headerStyle.setFont(font);
        headerStyle.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // 🔹 Crear fila de encabezados
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Nombre", "Apellido", "DNI", "Teléfono", "Correo", "Dirección"};

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerStyle);
        }

        // 🔹 Agregar datos
        int rowNum = 1;
        for (Paciente p : pacientes) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(p.getNombre());
            row.createCell(1).setCellValue(p.getApellido());
            row.createCell(2).setCellValue(p.getDni());
            row.createCell(3).setCellValue(p.getTelefono());
            row.createCell(4).setCellValue(p.getCorreo());
            row.createCell(5).setCellValue(p.getDireccion());
        }

        // 🔹 Ajustar columnas automáticamente
        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // 🔹 Enviar al navegador
        workbook.write(response.getOutputStream());
        workbook.close();
    }
}
