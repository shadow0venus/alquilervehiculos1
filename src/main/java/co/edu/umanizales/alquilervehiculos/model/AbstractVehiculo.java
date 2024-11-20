package co.edu.umanizales.alquilervehiculos.model;

public abstract class AbstractVehiculo {
    protected String matricula;
    protected int km;
    protected boolean estado;

    public AbstractVehiculo(String matricula, int km, boolean estado) {
        this.matricula = matricula;
        this.km = km;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}









