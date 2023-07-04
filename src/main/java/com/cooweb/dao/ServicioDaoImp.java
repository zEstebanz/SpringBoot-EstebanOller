package com.cooweb.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cooweb.models.Servicio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ServicioDaoImp implements ServicioDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Servicio> obtenerServicios() {
		
		String query="FROM Servicio";
		List<Servicio> result=entityManager.createQuery(query).getResultList();
		
		return result;
	}

}
