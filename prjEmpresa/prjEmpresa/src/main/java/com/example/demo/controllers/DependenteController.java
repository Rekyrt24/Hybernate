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

import com.example.demo.entities.Dependente;
import com.example.demo.services.DependenteService;

@RestController
@RequestMapping("/dependente")

public class DependenteController {
    private final DependenteService dependenteService;

    @Autowired
    public DependenteController(DependenteService dependenteService) {
        this.dependenteService = dependenteService;
    }

    @PostMapping
    public Dependente createDependente(@RequestBody Dependente dependente) {
        return dependenteService.saveDependente(dependente);
    }

    @GetMapping("/{id}")
    public Dependente getDependente(@PathVariable Long id) {
        return dependenteService.findDependenteById(id);
    }

    @GetMapping
    public List<Dependente> getAllDependente() {
        return dependenteService.getAllDependentes();
    }

    @DeleteMapping("/{id}")
    public void deleteDependente(@PathVariable Long id) {
    	dependenteService.findDependenteById(id);
    }
}
