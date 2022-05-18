package com.mjv.projetofinal.aventuraitens.dto;

public class ProdutoDto {
	
	private String nomeProduto;
	private String descricao;
	private Double preco;
	private Integer quantidadeEmEstoque;
	private Integer idAventura;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public Integer getIdAventura() {
		return idAventura;
	}
	public void setIdAventura(Integer idAventura) {
		this.idAventura = idAventura;
	}
	

}
