package com.example.demo.services.impl;

import com.example.demo.models.Pais;
import com.example.demo.repositories.PaisRepository;
import com.example.demo.services.PaisService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisServiceImpl implements PaisService {

    private final PaisRepository paisRepository;

    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public List<Pais> listar() {
        return paisRepository.findAll();
    }

    @Override
    public Optional<Pais> buscarPorId(Long id) {
        return paisRepository.findById(id);
    }

    @Override
    public Pais guardar(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public void eliminar(Long id) {
        paisRepository.deleteById(id);
    }
}
