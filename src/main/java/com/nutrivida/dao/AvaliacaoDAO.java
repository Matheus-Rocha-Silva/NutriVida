package com.nutrivida.dao;

import java.util.List;

import com.nutrivida.model.Avaliacao;

public interface AvaliacaoDAO {
	public void inserirAvaliacao(Avaliacao avaliacao);
	public List<Avaliacao> listarPorReceita(int idReceita);
}
