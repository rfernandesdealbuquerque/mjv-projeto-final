package com.mjv.projetofinal.aventuraitens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.aventuraitens.model.Aventura;
import com.mjv.projetofinal.aventuraitens.service.AventuraService;

@RestController
@RequestMapping("/aventuras")
public class AventuraController {
	
	@Autowired
	private AventuraService aventuraService;
	
	@PostMapping("/criarAventura")
	public String criarAventura(@RequestBody Aventura aventura) {
		aventuraService.criarAventura(aventura);
		return "Aventura criada com sucesso!";
	}
	
	@GetMapping("/listarAventuras")
	public List<Aventura> listarAventuras(){
		return aventuraService.listarAventuras();
	}

}
