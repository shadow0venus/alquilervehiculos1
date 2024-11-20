package co.edu.umanizales.alquilervehiculos.controller;

import co.edu.umanizales.alquilervehiculos.model.AbstractVehiculo;
import co.edu.umanizales.alquilervehiculos.service.GestionVehiculosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class AlquilerVehiculosController {
    private final GestionVehiculosService gestionVehiculosService;

    public AlquilerVehiculosController(GestionVehiculosService gestionVehiculosService) {
        this.gestionVehiculosService = gestionVehiculosService;
    }

    @GetMapping
    public List<AbstractVehiculo> listarVehiculos() {
        return gestionVehiculosService.listarVehiculos();
    }

    @PostMapping
    public void registrarVehiculo(@RequestBody AbstractVehiculo vehiculo) {
        gestionVehiculosService.registrarVehiculo(vehiculo);
    }
}

//AbstractVehiculo: Representa la clase base para todos los vehículos (como coches, motos, etc.).
//GestionVehiculosService: Servicio que contiene la lógica de negocio (cómo manejar los datos de vehículos).
//@RestController y otros: Anotaciones para hacer que este archivo sea un controlador que maneja solicitudes HTTP.

//@RestController: Indica que esta clase es un controlador de Spring Boot que maneja solicitudes HTTP REST.
//Devuelve datos en formato JSON en lugar de páginas web.
//@RequestMapping("/vehiculos"): Especifica la URL base para todas las rutas de este controlador.


//Se está pasando el servicio GestionVehiculosService al constructor de esta clase.
//Esto permite usar los métodos de este servicio para manejar la lógica (como listar o registrar vehículos)->
// ->sin que este controlador tenga que preocuparse por los detalles internos.

//@GetMapping: Indica que este metodo maneja solicitudes HTTP GET (para consultar datos).
//public List<AbstractVehiculo> listarVehiculos():
//List<AbstractVehiculo>: Devuelve una lista de vehículos en formato JSON.
//gestionVehiculosService.listarVehiculos():
//Llama al metodo del servicio que devuelve los vehículos registrados.

//@RequestBody AbstractVehiculo vehiculo:
//Toma el cuerpo de la solicitud (en formato JSON) y lo convierte automáticamente en un objeto AbstractVehiculo.