package com.example.demo.controllers;

import com.example.demo.models.Nacionalidad;
import com.example.demo.services.NacionalidadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nacionalidades")
public class NacionalidadController {

    private final NacionalidadService nacionalidadService;

    public NacionalidadController(NacionalidadService nacionalidadService) {
        this.nacionalidadService = nacionalidadService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("nacionalidades", nacionalidadService.listar());
        return "nacionalidad/list";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("nacionalidad", new Nacionalidad());
        return "nacionalidad/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Nacionalidad nacionalidad) {
        nacionalidadService.guardar(nacionalidad);
        return "redirect:/nacionalidades";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Nacionalidad nacionalidad = nacionalidadService.buscarPorId(id).orElseThrow();
        model.addAttribute("nacionalidad", nacionalidad);
        return "nacionalidad/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        nacionalidadService.eliminar(id);
        return "redirect:/nacionalidades";
    }
}