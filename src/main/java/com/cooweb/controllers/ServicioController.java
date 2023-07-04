package com.cooweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.cooweb.dao.ServicioDao;
import com.cooweb.models.Servicio;

@RestController
public class ServicioController {
	
	@Autowired
	private ServicioDao ServicioDao;
	
	@RequestMapping(value="api/Servicios")
	public List<Servicio>getServicios(){
		List<Servicio> product = ServicioDao.obtenerServicios();
		return product;
	}

}
