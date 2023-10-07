package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona mauro;
	private Persona luisa;
	private PersonaConApellido lucas;
	
	@BeforeEach
	public void setUp() {
		mauro = Persona.crearPersona("Mauro", LocalDate.of(1996,8,3));
		luisa = Persona.crearPersona("Luisa", LocalDate.of(1944,11,19));
		lucas = new PersonaConApellido("Lucas", "Sandoval", LocalDate.of(1997, 7, 29));
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
	
	@Test
	public void lucasEsMenorQueMauro() {
		assertTrue(lucas.menorQue(mauro));
	}
	
	@Test
	public void mauroNoEsMenorQueLucas() {
		assertFalse(mauro.menorQue(lucas));
	}
}
