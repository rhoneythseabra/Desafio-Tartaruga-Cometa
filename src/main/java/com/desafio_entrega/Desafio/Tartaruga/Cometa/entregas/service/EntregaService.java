package com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.service;

import com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.model.Entrega;
import com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public List<Entrega> findALl() {
        return entregaRepository.findAll();
    }

    public Optional<Entrega> findById(Long id) {
        return entregaRepository.findById(id);
    }

    public Entrega save(Entrega entrega) {
        return entregaRepository.save(entrega);
    }

    public void deleteById(Long Id) {
        entregaRepository.deleteById(Id);
    }
}
