package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class PersonaConApellido extends Persona{
	private String apellido;
	
	public PersonaConApellido(String nombre, String apellido, LocalDate fechaNac) {
		super(nombre, fechaNac);
		this.apellido = apellido;
	}
}
