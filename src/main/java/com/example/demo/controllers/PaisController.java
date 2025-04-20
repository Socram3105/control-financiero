package com.example.demo.controllers;

import com.example.demo.models.Pais;
import com.example.demo.services.PaisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paises")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("paises", paisService.listar());
        return "pais/list";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("pais", new Pais());
        return "pais/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Pais pais) {
        paisService.guardar(pais);
        return "redirect:/paises";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("pais", paisService.buscarPorId(id).orElseThrow());
        return "pais/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        paisService.eliminar(id);
        return "redirect:/paises";
    }
}
