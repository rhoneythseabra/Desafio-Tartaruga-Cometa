package com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String remetente;
    private String destinatario;

    @ElementCollection
    private List<String> produtos;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
