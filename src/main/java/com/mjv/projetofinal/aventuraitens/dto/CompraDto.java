package com.mjv.projetofinal.aventuraitens.dto;

import java.util.List;

import com.mjv.projetofinal.aventuraitens.model.TipoPagamento;
import com.mjv.projetofinal.aventuraitens.service.TipoPagamentoService;

public class CompraDto {
	
	private Integer idCadastro;
	private List<ItemCompradoDto> itensComprados;
	private TipoPagamento tipoPagamento;
	
	public Integer getIdCadastro() {
		return idCadastro;
	}
	public void setIdCadastro(Integer idCadastro) {
		this.idCadastro = idCadastro;
	}
	public List<ItemCompradoDto> getItensComprados() {
		return itensComprados;
	}
	public void setItensComprados(List<ItemCompradoDto> itensComprados) {
		this.itensComprados = itensComprados;
	}
	public String getTipoPagamento() {
		return tipoPagamento.toString();
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = TipoPagamentoService.StringtoTipoPagamento(tipoPagamento) == null ? TipoPagamento.ERRO : TipoPagamentoService.StringtoTipoPagamento(tipoPagamento);
	}
	

}
