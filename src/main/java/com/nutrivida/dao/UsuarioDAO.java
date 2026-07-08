package com.nutrivida.dao;

import java.util.List;

import com.nutrivida.model.Seguidor;
import com.nutrivida.model.Usuario;

public interface UsuarioDAO {
	public void inserir(Usuario usuario);
	public Usuario buscarPorId(Usuario id);
	public List<Usuario> buscarTodos();
	public Usuario autenticarDados(String email, String senha);
	public boolean seguirUsuario(Seguidor seguidor);
}
