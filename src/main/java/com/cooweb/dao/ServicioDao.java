package com.cooweb.dao;

import java.util.List;

import com.cooweb.models.Servicio;

import jakarta.transaction.Transactional;

@Transactional
public interface ServicioDao {
	
	List<Servicio> obtenerServicios();

}
