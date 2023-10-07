package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo;
	private PersonaConApellido lucas;
	private PersonaConApellido mauro;
	
	@BeforeEach
	public void setUp() {
		equipo = new EquipoDeTrabajo("equipo maravilla");
		lucas = new PersonaConApellido("Lucas", "Sandoval", LocalDate.of(1997, 7, 29));
		mauro = new PersonaConApellido("Mauro", "Sandoval", LocalDate.of(1996, 8, 3));
	}
	
	@Test
	void promedioDeEdadSinPersonas() {
		int edades = equipo.promedioDeEdad();

		assertEquals(0,edades);
	}

	@Test
	void promedioDeEdadPersonas() {
		equipo.agregarPersona(mauro);
		equipo.agregarPersona(lucas);
		int edades = equipo.promedioDeEdad();

		assertEquals(26,edades);
	}

}
