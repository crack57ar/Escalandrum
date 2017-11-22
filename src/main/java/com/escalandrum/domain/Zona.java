package com.escalandrum.domain;

import java.util.Collections;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "zona")
public class Zona {

	@Id
	public String id;
	
	public String nombre;
	public String descripcion;
	public Location ubicacion;
	public List<Sector> sectores;
	
	//public Zona() {}
	
	public Zona(String nombre, String descripcion, Location ubicacion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
	}
	
	public List<Sector> getSectores() {
		return sectores;
	}

	public Zona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	@Override
	public boolean equals( Object zona) {		
		return (zona instanceof Zona) ? ((Zona)zona).nombre.equals(this.nombre) : false;
	}
	
	public void agregarSubSector(Sector subsector) {
		if(sectores == null)
			this.sectores = Collections.emptyList();
		this.sectores.add(subsector);
	}
	
	
}
