package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Departamento;
import com.example.demo.repositories.DepartamentoRepository;

public class DepartamentoService {

	private final DepartamentoRepository departamentoRepository;
	@Autowired
    public DepartamentoService (DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    // preparando as buscas por id
    public Departamento findDepartamentoById(Long id) {
        Optional<Departamento> Departamento = departamentoRepository.findById(id);
        return Departamento.orElse(null);
    }

    // preparando a busca geral
    public List<Departamento> findAllDepartamento() {
        return departamentoRepository.findAll();
    }

    // salvando o Jogo
    public Departamento insertDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
    public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
    public List<Departamento> getAllDepartamentos() {
		return departamentoRepository.findAll();
	}
}