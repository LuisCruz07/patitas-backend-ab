package pe.edu.cibertec.patitasbackendab.dto;

public record LoginRequestDTO(String tipoDocumento, String numeroDocumento, String password) {
}