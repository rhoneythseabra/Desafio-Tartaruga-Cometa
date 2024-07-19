package com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.controller;

import com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.model.Entrega;
import com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.repository.EntregaRepository;
import com.desafio_entrega.Desafio.Tartaruga.Cometa.entregas.service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entregas")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public String list(Model model) {
        List<Entrega> entregas = entregaService.findALl();
        model.addAttribute("entregas", entregas);
        return "list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("entrega", new Entrega());
        return "create";
    }

    @PostMapping
    public String save(@ModelAttribute Entrega entrega){
        entregaService.save(entrega);
        return "redirect:/entregas";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable Long id, Model model) {
        Entrega entrega = entregaService.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Entrega" + id));
        model.addAttribute("entrega", entrega);
        return "show";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        Entrega entrega = entregaService.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Entrega" + id));
        model.addAttribute("entrega", entrega);
        return "edit";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Entrega entrega) {
        entrega.setId(id);
        entregaService.save(entrega);
        return "redirect:/entregas";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        entregaService.deleteById(id);
        return "redirect:/entregas";
    }
}
