package com.nutrivida.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receita {
	private Usuario autor;
	public Date dataCriado;
	public String descPreparo;
	public List<Resenha> resenhas = new ArrayList<Resenha>();
	
}
