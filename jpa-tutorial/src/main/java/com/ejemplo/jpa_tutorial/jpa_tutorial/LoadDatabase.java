package com.ejemplo.jpa_tutorial.jpa_tutorial;

import com.ejemplo.jpa_tutorial.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.jpa_tutorial.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(ProductoRepository repository) {
        return args -> {
            repository.save(new Producto("Laptop", "Laptop de alta gama", 1500.00));
            repository.save(new Producto("Smartphone", "Smartphone con cámara de 48MP", 700.00));
            repository.save(new Producto("Monitor", "Monitor 4K de 27 pulgadas", 300.00));
            repository.save(new Producto("Teclado", "Teclado mecánico retroiluminado", 100.00));
            repository.save(new Producto("Mouse", "Mouse inalámbrico ergonómico", 50.00));
        };
    }
}
