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

import com.example.demo.entities.Funcionario;
import com.example.demo.services.FuncionarioService;

@RestController
@RequestMapping("/funcionario")

public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.saveFuncionario(funcionario);
    }

    @GetMapping("/{id}")
    public Funcionario getFuncionario(@PathVariable Long id) {
        return funcionarioService.findFuncionarioById(id);
    }

    @GetMapping
    public List<Funcionario> getAllFuncionario() {
        return funcionarioService.getAllFuncionarios();
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable Long id) {
        funcionarioService.findFuncionarioById(id);
    }
}