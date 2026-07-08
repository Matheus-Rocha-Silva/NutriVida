package com.nutrivida.model;

import java.util.Date;

public class Receita {
	private int id;
	private String titulo;
	private String ingredientes;
	private String modoPreparo;
	private String categoria;
	private Usuario idAutor;
	private Date dataPostagem;
	
	public Receita(int id, String titulo, String ingredientes, String modoPreparo, String categoria, Usuario idAutor,
			Date dataPostagem) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.modoPreparo = modoPreparo;
		this.categoria = categoria;
		this.idAutor = idAutor;
		this.dataPostagem = dataPostagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Usuario getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Usuario idAutor) {
		this.idAutor = idAutor;
	}

	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
	
	
}
