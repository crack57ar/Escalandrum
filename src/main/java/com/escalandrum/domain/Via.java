package com.escalandrum.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "via")
public class Via {
	
	public enum TipoDeVia {CLASICA,DEPORTIVA}
	
	@Id
	public String id;
	
	public String nombre;
	public Graduacion grado;
	public TipoDeVia tipo;
	public String aperturista;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Graduacion getGrado() {
		return grado;
	}
	public void setGrado(Graduacion grado) {
		this.grado = grado;
	}
	public TipoDeVia getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeVia tipo) {
		this.tipo = tipo;
	}
	public String getAperturista() {
		return aperturista;
	}
	public void setAperturista(String aperturista) {
		this.aperturista = aperturista;
	}
	public String getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object via) {
		return (via instanceof Via) ? ((Via)via).nombre.equals(this.nombre) : false;
	}
	
	@Override
	public String toString() {
		return String.format("Via [ id: %s nombre : %s grado : %s]", id ,nombre, grado);
	}
	
	
}
