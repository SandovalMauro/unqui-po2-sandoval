package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> personas;
	
	public EquipoDeTrabajo(String nombre, List<Persona> personas) {
		this.nombre = nombre;
		this.personas = personas;
	}
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.personas = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona p) {
		this.personas.add(p);
	}
	
	public void eliminarPersona(Persona p) {
		this.personas.remove(p);
	}

	public String getNombre() {
		return nombre;
	}
	
	public int promedioDeEdad() {
		return (int)this.personas.stream()
				.mapToInt(p-> p.edad())
				.average()
				.orElse(0);
	}
}
