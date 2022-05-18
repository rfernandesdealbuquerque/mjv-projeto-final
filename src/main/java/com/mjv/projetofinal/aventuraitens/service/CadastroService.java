package com.mjv.projetofinal.aventuraitens.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.dto.CadastroDto;
import com.mjv.projetofinal.aventuraitens.model.Cadastro;
import com.mjv.projetofinal.aventuraitens.model.Produto;
import com.mjv.projetofinal.aventuraitens.repository.CadastroRepository;
import com.mjv.projetofinal.aventuraitens.repository.ProdutoRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository cadastroRepository;
	
	public String adicionarCadastro(CadastroDto cadastroDto) {
		Cadastro cadastro = new Cadastro();
		cadastro.setNome(cadastroDto.getNome());
		cadastro.setCpf(cadastroDto.getCpf());
		cadastro.setDataNascimento(cadastroDto.getDataNascimento());
		cadastro.setEmail(cadastroDto.getEmail());
		cadastro.setWhatsapp(cadastroDto.getWhatsapp());
		cadastro.setEndereco(cadastroDto.getEndereco());
		cadastroRepository.save(cadastro);
		return "Cadastro de nome " + cadastro.getNome() + " adicionado com sucesso!";
	}
	
	public List<Cadastro> listarTodos() {
		return cadastroRepository.findAll();
	}
	
	public List<Cadastro> buscarCadastro(String nome) {
		List<Cadastro> cadastros = cadastroRepository.findAll();
		List<Cadastro> cadastrosBuscados = new ArrayList<Cadastro>();
		for(Cadastro cadastro : cadastros) {
			if(cadastro.getNome().contains(nome)) {
				cadastrosBuscados.add(cadastro);
			}
		}
		return cadastrosBuscados;
		
	}
	public String deletarCadastro(Integer id) {
		Cadastro cadastroDeletado = cadastroRepository.findById(id).orElse(null);
		if(cadastroDeletado == null) {
			return "id do cadastro não existe! Favor consultar cadastros e inserir id correto.";
		}
		cadastroRepository.deleteById(id);
		return "Produto de id " + cadastroDeletado.getId() + " de nome " + cadastroDeletado.getNome() + " deletado com sucesso!";
	}
	
	public String alterarCadastro(Integer id, CadastroDto cadastroDto) {
		Cadastro cadastroAtualizado = cadastroRepository.findById(id).orElse(null);
		
		if(cadastroAtualizado == null) {
			return "id do cadastro não existe! Favor consultar cadastros e inserir id correto.";
		}
		cadastroAtualizado.setNome(cadastroDto.getNome());
		cadastroAtualizado.setCpf(cadastroDto.getCpf());
		cadastroAtualizado.setDataNascimento(cadastroDto.getDataNascimento());
		cadastroAtualizado.setEmail(cadastroDto.getEmail());
		cadastroAtualizado.setWhatsapp(cadastroDto.getWhatsapp());
		cadastroAtualizado.setEndereco(cadastroDto.getEndereco());
		cadastroRepository.save(cadastroAtualizado);
		
		return "Cadastro de id " + cadastroAtualizado.getId() + " alterado com sucesso!";
	}
}
