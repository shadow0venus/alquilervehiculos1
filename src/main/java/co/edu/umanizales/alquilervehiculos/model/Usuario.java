package co.edu.umanizales.alquilervehiculos.model;

public class Usuario {
    private String cedula; // Login del usuario
    private String nombre;
    private String password;

    public Usuario(String cedula, String nombre, String password) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


