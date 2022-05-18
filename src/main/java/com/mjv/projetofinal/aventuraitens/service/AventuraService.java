package com.mjv.projetofinal.aventuraitens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.repository.AventuraRepository;
import com.mjv.projetofinal.aventuraitens.model.Aventura;

@Service
public class AventuraService {
	@Autowired
	private AventuraRepository aventuraRepository;
	
	public void criarAventura(Aventura aventura) {
		aventuraRepository.save(aventura);
	}
	
	public List<Aventura> listarAventuras(){
		return aventuraRepository.findAll();
	}
	

}
