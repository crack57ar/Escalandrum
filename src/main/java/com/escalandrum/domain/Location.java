package com.escalandrum.domain;

public class Location {

	public double latitud;
	public double longitud;
	
	
	public Location(double latitud, double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	@Override
	public boolean equals( Object location) {		
		return (location instanceof Location) ? 
				 ( ((Location)location).latitud == this.latitud && 
				   ((Location)location).longitud == this.longitud) : false;
	}
	
	public int hashCode() {
		return new Integer(latitud + "0" + longitud);
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	
}
