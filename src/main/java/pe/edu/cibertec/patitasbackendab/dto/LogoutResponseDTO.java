package pe.edu.cibertec.patitasbackendab.dto;

import java.util.Date;

public record LogoutResponseDTO(Boolean resultado, Date fecha, String mensajeError) {
}