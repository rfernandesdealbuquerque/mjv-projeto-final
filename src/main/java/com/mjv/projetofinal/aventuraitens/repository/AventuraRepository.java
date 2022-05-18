package com.mjv.projetofinal.aventuraitens.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.aventuraitens.model.Aventura;

public interface AventuraRepository extends JpaRepository<Aventura, Integer>{
	
	Optional<Aventura> findByNomeAventuraContaining(String infix);
} 