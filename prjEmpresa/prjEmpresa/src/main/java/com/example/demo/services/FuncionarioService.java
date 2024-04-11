package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;

public class FuncionarioService {

	private final FuncionarioRepository funcionarioRepository;
	@Autowired
    public FuncionarioService (FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    // preparando as buscas por id
    public Funcionario findFuncionarioById(Long id) {
        Optional<Funcionario> Funcionario = funcionarioRepository.findById(id);
        return Funcionario.orElse(null);
    }

    // preparando a busca geral
    public List<Funcionario> findAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    // salvando o Jogo
    public Funcionario insertFuncionarios(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}
}