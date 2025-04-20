package com.example.demo.services;

import com.example.demo.models.Nacionalidad;

import java.util.List;
import java.util.Optional;

public interface NacionalidadService {
    List<Nacionalidad> listar();
    Optional<Nacionalidad> buscarPorId(Long id);
    Nacionalidad guardar(Nacionalidad nacionalidad);
    void eliminar(Long id);
}
