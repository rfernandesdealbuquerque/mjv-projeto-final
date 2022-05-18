package com.mjv.projetofinal.aventuraitens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.aventuraitens.dto.CadastroDto;
import com.mjv.projetofinal.aventuraitens.model.Cadastro;
import com.mjv.projetofinal.aventuraitens.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	@Autowired
	private CadastroService cadastroService;
	
	@PostMapping("/adicionarCadastro")
	public String adicionarCadastro(@RequestBody CadastroDto cadastro) {
		return cadastroService.adicionarCadastro(cadastro);
	}
	
	@GetMapping("/listarTodos")
	public List<Cadastro> listarTodos(){
		return cadastroService.listarTodos();
	}
	
	@PutMapping("/alterarCadastro/{idCadastro}")
	public String alterarCadastro(@PathVariable Integer idCadastro, @RequestBody CadastroDto cadastro) {
		return cadastroService.alterarCadastro(idCadastro, cadastro);
	}
	
	@GetMapping("/buscarPorNome/{Nome}")
	public List<Cadastro> buscarCadastro(@PathVariable String Nome){
		return cadastroService.buscarCadastro(Nome);
	}
	
	//@DeleteMapping(value = "deletarCadastro/{idCadastro}")
	//public String deletarCadastro(@PathVariable Integer idCadastro) {
		//return cadastroService.deletarCadastro(idCadastro);
	//}
	
	
	
};