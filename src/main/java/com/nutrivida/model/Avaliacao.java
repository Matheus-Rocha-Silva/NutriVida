package com.nutrivida.model;

import java.util.Date;

public class Avaliacao {
	private int id;
	private Usuario idUsuario;
	private Receita idReceita;
	private int nota;
	private String comentario;
	private Date dataAvaliacao;
	
	public Avaliacao() {}
	
	public Avaliacao(Usuario idUsuario, Receita idReceita, int nota, String comentario, Date dataAvaliacao) {
		this.idUsuario = idUsuario;
		this.idReceita = idReceita;
		this.nota = nota;
		this.comentario = comentario;
		this.dataAvaliacao = dataAvaliacao;
	}

	public Avaliacao(int id, Usuario idUsuario, Receita idReceita, int nota, String comentario, Date dataAvaliacao) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idReceita = idReceita;
		this.nota = nota;
		this.comentario = comentario;
		this.dataAvaliacao = dataAvaliacao;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
	
}
