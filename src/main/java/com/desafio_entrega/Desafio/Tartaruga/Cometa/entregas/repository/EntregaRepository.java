package com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.repository;

import com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
