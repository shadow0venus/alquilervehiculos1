package co.edu.umanizales.alquilervehiculos.service;

import co.edu.umanizales.alquilervehiculos.model.AbstractVehiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GestionVehiculosService {
    private final List<AbstractVehiculo> vehiculos = new ArrayList<>();

    public void registrarVehiculo(AbstractVehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<AbstractVehiculo> listarVehiculos() {
        return vehiculos;
    }
}


