package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Persona {
	private String nombre;
	private LocalDate fechaNac;
	
	public Persona(String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int edad() {
		int edad = LocalDate.now().getYear() - this.fechaNac.getYear();
		if(this.fechaNac.getDayOfYear()> LocalDate.now().getDayOfYear()) {edad--;}
		return edad;
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
	public static Persona crearPersona(String nombre, LocalDate fechaNac) {
		return new Persona(nombre, fechaNac);
	}
	
//	public int edad() {
//		Calendar calendariofechActual = Calendar.getInstance();
//		Calendar calendariofechNac = Calendar.getInstance();
//		calendariofechNac.setTime(fechaNac);
//		int edad = calendariofechActual.get(Calendar.YEAR) - calendariofechNac.get(Calendar.YEAR);
//		
//		if(calendariofechNac.get(Calendar.DAY_OF_YEAR)> calendariofechActual.get(Calendar.DAY_OF_YEAR)) {edad--;}
//		
//		return edad;
//	}
	
}
