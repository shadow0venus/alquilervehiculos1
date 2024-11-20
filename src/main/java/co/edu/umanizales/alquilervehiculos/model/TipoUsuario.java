package co.edu.umanizales.alquilervehiculos.model;

public class TipoUsuario {
    private String codigo;
    private String descripcion;

    public TipoUsuario(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
}

//Getters y Setters permiten manipular los atributos de forma controlada.
//validarUsuario gestiona la autenticación de los usuarios, asegurándose de que las credenciales coincidan.
//listarVehiculos facilita la recuperación de todos los vehículos registrados, útil para consultas.
//AlquilervehiculosApplication es el lugar donde arranca el servidor y configura la aplicación Spring Boot.

