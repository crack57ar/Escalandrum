package com.escalandrum.domain;

public class Graduacion {
     
	public int grado;
	public Dificultad dificultad;
	
	public Graduacion(int grado, Dificultad dificultad) {
		super();
		this.grado = grado;
		this.dificultad = dificultad;
	}

	@Override
	public boolean equals(Object graduacion) {
		return (graduacion instanceof Graduacion) ? ((Graduacion)graduacion).grado == this.grado && ((Graduacion)graduacion).dificultad.equals(dificultad) : false;
	}

	@Override
	public String toString() {
		return grado + dificultad.toString();
	}

	public enum Dificultad {
		A("a"),
		Amas("a+"),
		B("b"),
		Bmas("b+"),
		C("c"),
		Cmas("c+");
		
		private String tag;

		private Dificultad(String tag) {
			this.tag = tag;
		}

		@Override
		public String toString() {
			return getTag();
		}

		public String getTag() {
			return tag;
		}
		
		
		
	}
	
}
