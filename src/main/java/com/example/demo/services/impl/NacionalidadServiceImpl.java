package com.example.demo.services.impl;

import com.example.demo.models.Nacionalidad;
import com.example.demo.repositories.NacionalidadRepository;
import com.example.demo.services.NacionalidadService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NacionalidadServiceImpl implements NacionalidadService {

    private final NacionalidadRepository nacionalidadRepository;

    public NacionalidadServiceImpl(NacionalidadRepository nacionalidadRepository) {
        this.nacionalidadRepository = nacionalidadRepository;
    }

    @Override
    public List<Nacionalidad> listar() {
        return nacionalidadRepository.findAll();
    }

    @Override
    public Optional<Nacionalidad> buscarPorId(Long id) {
        return nacionalidadRepository.findById(id);
    }

    @Override
    public Nacionalidad guardar(Nacionalidad nacionalidad) {
        return nacionalidadRepository.save(nacionalidad);
    }

    @Override
    public void eliminar(Long id) {
        nacionalidadRepository.deleteById(id);
    }
}
