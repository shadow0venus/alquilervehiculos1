package co.edu.umanizales.alquilervehiculos.controller;

import co.edu.umanizales.alquilervehiculos.model.Usuario;
import co.edu.umanizales.alquilervehiculos.service.GestionUsuariosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final GestionUsuariosService gestionUsuariosService;

    public UsuarioController(GestionUsuariosService gestionUsuariosService) {
        this.gestionUsuariosService = gestionUsuariosService;
    }

    // Endpoint para registrar un nuevo usuario
    @PostMapping
    public void registrarUsuario(@RequestBody Usuario usuario) {
        gestionUsuariosService.registrarUsuario(usuario);
    }

    // Endpoint para listar todos los usuarios
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return gestionUsuariosService.listarUsuarios();
    }

    // Endpoint para validar un usuario (login)
    @PostMapping("/validar")
    public boolean validarUsuario(@RequestParam String login, @RequestParam String password) {
        return gestionUsuariosService.validarUsuario(login, password);
    }
}

//-Controlador (UsuarioController):
//Responsabilidad: Maneja las solicitudes HTTP relacionadas con los usuarios.
//Rutas importantes:
//POST /usuarios: Registrar un usuario.
//GET /usuarios: Listar todos los usuarios.
//POST /usuarios/validar: Validar un usuario.
//-Métodos Importantes:
//registrarUsuario():
//Recibe un objeto Usuario desde el cliente y lo registra en la lista.
//listarUsuarios():
//Devuelve una lista de todos los usuarios registrados.
//validarUsuario():
//Verifica si las credenciales del usuario son válidas.
//-Conexión con el Servicio:
//El controlador utiliza el servicio GestionUsuariosService para realizar operaciones de negocio, manteniendo la lógica separada y el código más limpio.


