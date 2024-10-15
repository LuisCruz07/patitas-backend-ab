package pe.edu.cibertec.patitasbackendab.service;
import pe.edu.cibertec.patitasbackendab.dto.LoginRequestDTO;
import pe.edu.cibertec.patitasbackendab.dto.LogoutRequestDTO;

import java.io.IOException;
import java.util.Date;

public interface AutenticacionService {

    String[] validarUsuario(LoginRequestDTO loginRequestDTO) throws IOException;

    Date cerrarSesionUsuario(LogoutRequestDTO logoutRequestDTO) throws IOException;

}