package co.edu.umanizales.alquilervehiculos.model;

public class Coche extends AbstractVehiculo implements VehiculoAble {
    private boolean extras;

    public Coche(String matricula, int km, boolean estado, boolean extras) {
        super(matricula, km, estado);
        this.extras = extras;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Coche [Matrícula: " + matricula + ", Kilómetros: " + km + ", Extras: " + extras + "]");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del coche con matrícula: " + matricula);
    }
}





