package ar.edu.unq.po2.practica;

public enum Color {
	ROJO("Sangrante",0), GRIS("Mejorando",1), AMARILLO("ya casi", 2), MIEL("recuperada",3);
	
	String decripcion;
	int nivelRiesgo;
	
	Color(String descripcion, int nivelRiesgo){
		this.decripcion = descripcion;
		this.nivelRiesgo = nivelRiesgo;
	}
	
//	public Color dameSiguienteEnMaduracion() {
//		
//	}
	
}
