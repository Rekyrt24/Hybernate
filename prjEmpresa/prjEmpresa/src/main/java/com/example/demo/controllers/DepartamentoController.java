package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departamento;
import com.example.demo.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")

public class DepartamentoController {
    private final DepartamentoService departamentoService;

    @Autowired
    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @PostMapping
    public Departamento createDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.saveDepartamento(departamento);
    }

    @GetMapping("/{id}")
    public Departamento getDepartamento(@PathVariable Long id) {
        return departamentoService.findDepartamentoById(id);
    }

    @GetMapping
    public List<Departamento> getAllDepartamento() {
        return departamentoService.getAllDepartamentos();
    }

    @DeleteMapping("/{id}")
    public void deleteDepartamento(@PathVariable Long id) {
    	departamentoService.findDepartamentoById(id);
    }
}

