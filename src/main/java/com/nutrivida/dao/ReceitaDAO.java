package com.nutrivida.dao;

import java.util.List;

import com.nutrivida.model.Receita;

public interface ReceitaDAO {
	public void inserirReceita(Receita receita);
	public void atualizarReceita(Receita receita);
	public void excluirReceita(Receita receita);
	public Receita buscarPorId(int id);
	public List<Receita> listarTodas();
	public List<Receita> listarPorCategoria(String categoria);
}
