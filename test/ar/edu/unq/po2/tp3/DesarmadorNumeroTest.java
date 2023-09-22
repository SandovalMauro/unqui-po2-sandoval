package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorNumeroTest {
	
	private DesarmadorNumero desarmador;
	
	@BeforeEach
	public void setUp() {
	
		//Se crea el desarmador
		desarmador = new DesarmadorNumero();
		
	}
	
	/**
	 * Verifica cual es el número con mas digitos pares
	 */
	@Test
	public void numeroConMasDigitosPares() {
		int amount = desarmador.mayorDigitosPares(new int[] {1436,226,15793});
		
		assertEquals(amount, 226);
	}
	
}
