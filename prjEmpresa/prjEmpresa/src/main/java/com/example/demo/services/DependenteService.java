package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Dependente;
import com.example.demo.repositories.DependenteRepository;

public class DependenteService {
	
	private final DependenteRepository dependenteRepository;
		@Autowired
	    public DependenteService (DependenteRepository dependenteRepository) {
	        this.dependenteRepository = dependenteRepository;
	    }

	    // preparando as buscas por id
	    public Dependente findDependenteById(Long id) {
	        Optional<Dependente> Dependente = dependenteRepository.findById(id);
	        return Dependente.orElse(null);
	    }

	    // preparando a busca geral
	    public List<Dependente> findAllDependente() {
	        return dependenteRepository.findAll();
	    }

	    // salvando o Jogo
	    public Dependente insertDependente(Dependente dependente) {
	        return dependenteRepository.save(dependente);
	    }
		public Dependente saveDependente(Dependente dependente) {
			return dependenteRepository.save(dependente);
		}
		public List<Dependente> getAllDependentes() {
			return dependenteRepository.findAll();
		}
}