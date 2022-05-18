package com.mjv.projetofinal.aventuraitens.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.dto.ProdutoDto;
import com.mjv.projetofinal.aventuraitens.model.Aventura;
import com.mjv.projetofinal.aventuraitens.model.Produto;
import com.mjv.projetofinal.aventuraitens.repository.AventuraRepository;
import com.mjv.projetofinal.aventuraitens.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private AventuraRepository aventuraRepository;
	
	
	public String adicionarProduto(ProdutoDto produtoDto) {
		Produto produto = new Produto();
		produto.setNomeProduto(produtoDto.getNomeProduto());
		produto.setDescricao(produtoDto.getDescricao());
		produto.setPreco(produtoDto.getPreco());
		produto.setQuantidadeEmEstoque(produtoDto.getQuantidadeEmEstoque());
		Aventura aventura = new Aventura();
		aventura.setId(produtoDto.getIdAventura());
		produto.setAventura(aventura);
		if(aventuraRepository.findById(produto.getAventura().getId()).orElse(null) == null) {
			return "id da aventura não existe! Favor consultar aventuras e inserir Id correto ou criar nova aventura.";
		}
		produtoRepository.save(produto); 
		return "Produto de nome " + produto.getNomeProduto() + " adicionado com sucesso!";
		
	}

	public String alterarProduto(Integer id, ProdutoDto produtoDto) {
		Produto produtoAtualizado = produtoRepository.findById(id).orElse(null);
		if(produtoAtualizado == null) {
			return "id do produto não existe! Favor consultar produtos e inserir id correto ou adicionar novo produto.";
		}
		if(aventuraRepository.findById(produtoDto.getIdAventura()).orElse(null) == null) {
			return "id da aventura não existe! Favor consultar aventuras e inserir Id correto ou criar nova aventura.";
		}
		Aventura aventura = new Aventura();
		aventura.setId(produtoDto.getIdAventura());
		produtoAtualizado.setAventura(aventura);
		produtoAtualizado.setDescricao(produtoDto.getDescricao());
		produtoAtualizado.setNomeProduto(produtoDto.getNomeProduto());
		produtoAtualizado.setPreco(produtoDto.getPreco());
		produtoAtualizado.setQuantidadeEmEstoque(produtoDto.getQuantidadeEmEstoque()); //Usar para alterar estoque
		
		produtoRepository.save(produtoAtualizado);
	
		return "Produto de id " + produtoAtualizado.getId() + " alterado com sucesso!";
		
	}
	
	public void atualizarEstoque(Integer id, Integer quantidadeComprada) {
		Produto produtoAtualizado = produtoRepository.findById(id).orElse(null);
		Integer quantidadeEmEstoque = produtoAtualizado.getQuantidadeEmEstoque();
		Integer novaQuantidadeEmEstoque = quantidadeEmEstoque - quantidadeComprada;
		produtoAtualizado.setQuantidadeEmEstoque(novaQuantidadeEmEstoque);
		produtoRepository.save(produtoAtualizado);
	}

	public List<Produto> listarTodos() {
		return produtoRepository.findAll();
	}
	
	public List<Produto> listarPorAventura(Integer idAventura) {
		return produtoRepository.findByAventuraId(idAventura);
	}
	
	public String deletarProduto(Integer idProduto) {
		Produto produtoDeletado = produtoRepository.findById(idProduto).orElse(null);
		if(produtoDeletado == null) {
			return "id do produto não existe! Favor consultar produtos e inserir id correto.";
		}
		produtoRepository.deleteById(idProduto);
		return "Produto de id " + produtoDeletado.getId() + " de nome " + produtoDeletado.getNomeProduto() + " deletado com sucesso!";
	}


}
