package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona mauro;
	private Persona luisa;
	
	@BeforeEach
	public void setUp() {
		mauro = Persona.crearPersona("Mauro", LocalDate.of(1996,8,3));
		luisa = Persona.crearPersona("Luisa", LocalDate.of(1944,11,19));
	}

	@Test
	public void edadDeMauro() {
		int edad = mauro.edad();
		assertEquals(27, edad);
	}

	@Test
	public void edadDeLuisa() {
		int edad = luisa.edad();
		assertEquals(78, edad);
	}
	
	@Test
	public void mauroEsMenorQueLuisa() {
		assertTrue(mauro.menorQue(luisa));
	}
}
