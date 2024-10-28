package com.practica.vehiculos.service;


import com.practica.vehiculos.model.Vehiculo;
import com.practica.vehiculos.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    // Métodos CRUD adicionales
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void eliminarVehiculo(int id) {
        vehiculoRepository.deleteById(id);
    }

    public Optional<Vehiculo> obtenerVehiculoPorId(int id) {
        return vehiculoRepository.findById(id);
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }
}
