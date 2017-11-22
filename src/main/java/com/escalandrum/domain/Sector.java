package com.escalandrum.domain;

import java.util.Collections;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sector")
public class Sector {
	
	@Id
	public String id;
	public String nombre;
	public List<Sector> subSectores;
	public List<Via> vias;

	public List<Via> getVias() {
		return vias;
	}

	public Sector(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sector> getSubSectores() {
		return subSectores;
	}

	public void agregarSubSector(Sector subsector) {
		if(subSectores == null)
			this.subSectores = Collections.emptyList();
		this.subSectores.add(subsector);
	}
	
	public void agrearVia(Via via) {
		if(vias == null)
			this.vias = Collections.emptyList();
		this.vias.add(via);
	}
	
	@Override
	public boolean equals(Object sector) {
		return (sector instanceof Sector) ? ((Sector)sector).nombre.equals(this.nombre) : false;
	}

	@Override
	public String toString() {
		return String.format("Sector [ id: %s nombre : %s ]", id ,nombre) + "/nvias :" + vias.toString();
	}
	
	
}
