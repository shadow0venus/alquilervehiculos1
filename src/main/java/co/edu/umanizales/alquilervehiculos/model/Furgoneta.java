package co.edu.umanizales.alquilervehiculos.model;

public class Furgoneta extends AbstractVehiculo implements VehiculoAble {
    private short capacidad;

    public Furgoneta(String matricula, int km, boolean estado, short capacidad) {
        super(matricula, km, estado);
        this.capacidad = capacidad;
    }

    public short getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(short capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Furgoneta [Matrícula: " + matricula + ", Kilómetros: " + km + ", Capacidad: " + capacidad + " toneladas]");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de la furgoneta con matrícula: " + matricula);
    }
}

