package co.edu.umanizales.alquilervehiculos.model;

public class Moto extends AbstractVehiculo implements VehiculoAble {
    private boolean casco;

    public Moto(String matricula, int km, boolean estado, boolean casco) {
        super(matricula, km, estado);
        this.casco = casco;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Moto [Matrícula: " + matricula + ", Kilómetros: " + km + ", Casco: " + casco + "]");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de la moto con matrícula: " + matricula);
    }
}



