package com.mjv.projetofinal.aventuraitens.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.aventuraitens.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	List<Produto> findByAventuraId(Integer id);
	
} 


