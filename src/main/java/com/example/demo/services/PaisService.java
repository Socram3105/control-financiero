package com.example.demo.services;

import com.example.demo.models.Pais;

import java.util.List;
import java.util.Optional;

public interface PaisService {
    List<Pais> listar();
    Optional<Pais> buscarPorId(Long id);
    Pais guardar(Pais pais);
    void eliminar(Long id);
}
