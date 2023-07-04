package com.cooweb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombreServicio")
	private String nombreServicio;
	
	@Column(name="precioServicio")
	private String precioServicio;
	
	@Column(name="descripcionServicio")
	private String descripcionServicio;
	
	@Column(name="contenidoServicio")
	private String contenidoServicio;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getnombreServicio() {
		return nombreServicio;
	}
	public void setnombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	public String getprecioServicio() {
		return precioServicio;
	}
	public void setprecioServicio(String precioServicio) {
		this.precioServicio = precioServicio;
	}
	public String getdescripcionServicio() {
		return descripcionServicio;
	}
	public void setdescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}
	public String getcontenidoServicio() {
		return contenidoServicio;
	}
	public void setcontenidoServicio(String contenidoServicio) {
		this.contenidoServicio = contenidoServicio;
	}
	
	

}
