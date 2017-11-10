package com.escalandrum.domain;

import org.springframework.data.annotation.Id;

public class Zona {

	@Id
	public String id;
	
	public String nombre;
	public String Descripcion;
	public Location ubicacion;
	
	public Zona() {}
	
	public Zona(String nombre, String descripcion, Location ubicacion) {
		super();
		this.nombre = nombre;
		Descripcion = descripcion;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Location getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Location ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return String.format("Zona [ id: %s nombre : %s ]", id ,nombre);
	}
	
}
