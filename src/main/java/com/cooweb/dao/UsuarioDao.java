package com.cooweb.dao;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.cooweb.models.Usuario;

@Transactional
public interface UsuarioDao {
	
	List<Usuario>  obtenerUsuarios();

}
