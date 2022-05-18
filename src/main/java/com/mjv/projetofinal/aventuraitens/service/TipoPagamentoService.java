package com.mjv.projetofinal.aventuraitens.service;

import com.mjv.projetofinal.aventuraitens.model.TipoPagamento;

public class TipoPagamentoService {
	
	public static TipoPagamento StringtoTipoPagamento(String string) {
		if (string.equals("DEBITO")) {
			return TipoPagamento.DEBITO;
		}
		if (string.equals("CREDITO")) {
			return TipoPagamento.CREDITO;
		}
		if (string.equals("DINHEIRO")) {
			return TipoPagamento.DINHEIRO;
		}
		if (string.equals("PIX")) {
			return TipoPagamento.PIX;
		}
		
		return null;
		
	}

}
