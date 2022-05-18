package com.mjv.projetofinal.aventuraitens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.aventuraitens.model.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer> {
		
	List<Compra> findByCadastroId (Integer id);
}
