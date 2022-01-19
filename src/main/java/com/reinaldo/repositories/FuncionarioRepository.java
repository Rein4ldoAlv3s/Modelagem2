package com.reinaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinaldo.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
}
