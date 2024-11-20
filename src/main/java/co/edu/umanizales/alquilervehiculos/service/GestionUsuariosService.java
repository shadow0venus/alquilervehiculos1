package co.edu.umanizales.alquilervehiculos.service;

import co.edu.umanizales.alquilervehiculos.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GestionUsuariosService {
    private final List<Usuario> lstUsuarios = new ArrayList<>();

    // Método para registrar un usuario
    public void registrarUsuario(Usuario usuario) {
        lstUsuarios.add(usuario);
    }

    // Método para listar todos los usuarios
    public List<Usuario> listarUsuarios() {
        return lstUsuarios;
    }

    // Método para validar el inicio de sesión
    public boolean validarUsuario(String login, String password) {
        for (Usuario usuario : lstUsuarios) {
            if (usuario.getCedula().equals(login) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

//Implementa la lógica para manejar usuarios:
//Almacenar usuarios.
//Validar credenciales.
//Listar usuarios.
//Métodos importantes:
//registrarUsuario(Usuario usuario):
//Agrega un usuario a una lista en memoria.
//listarUsuarios():
//Devuelve la lista de usuarios registrados.
//validarUsuario(String login, String password):
//Recorre la lista de usuarios para verificar si el login y password coinciden con un registro existente.



