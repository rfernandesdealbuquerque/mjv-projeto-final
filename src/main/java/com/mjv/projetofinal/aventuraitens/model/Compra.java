package com.mjv.projetofinal.aventuraitens.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.mjv.projetofinal.aventuraitens.service.TipoPagamentoService;


@Entity
@Table(name = "compras")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "compra_id")
	private Integer id;
	private Double valorTotal;
	
	@Enumerated(EnumType.STRING)
	private TipoPagamento tipoPagamento;
	
	@OneToMany(cascade = CascadeType.ALL) //ao inserirmos uma compra, queremos que isso reflita no banco de itens comprados
	@JoinColumn(name = "compra_id")
	private List<ItemComprado> itensComprados;
	
	@ManyToOne//uma compra necessitara sempre de um cadastro para ser criada; sem cascade porque se compra deletada, nao queremos que cadastro seja deletado
	@JoinColumn(name = "cadastro_id")
	private Cadastro cadastro;
	
	@Column(name = "data_hora_compra")
	private LocalDateTime dataHoraCompra;
	
	@PrePersist
	protected void onCreate() {
		if (this.dataHoraCompra == null)
			this.dataHoraCompra = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
	}

	public Integer getId() {
		return id;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public TipoPagamento getTipoPagamento() {
		return this.tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = TipoPagamentoService.StringtoTipoPagamento(tipoPagamento);
	}

	public List<ItemComprado> getItensComprados() {
		return itensComprados;
	}

	public void setItensComprados(List<ItemComprado> itensComprados) {
		this.itensComprados = itensComprados;
	}

	public LocalDateTime getDataHoraCompra() {
		return dataHoraCompra;
	}

	public void setDataHoraCompra(LocalDateTime dataHoraCompra) {
		this.dataHoraCompra = dataHoraCompra;
	}
	
	
	
}
