package com.reinaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinaldo.domain.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{
	
}
