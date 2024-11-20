package co.edu.umanizales.alquilervehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlquilervehiculosApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlquilervehiculosApplication.class, args);
    }
}

//@SpringBootApplication:
//
//Habilita la configuración automática de Spring Boot.
//Combina las anotaciones @Configuration, @ComponentScan y @EnableAutoConfiguration.
//Metodo main():
//
//Llama a SpringApplication.run(...) para iniciar la aplicación y arrancar el servidor.