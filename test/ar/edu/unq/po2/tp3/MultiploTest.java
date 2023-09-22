package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTest {

	private Multiplo multiplo;
	
	@BeforeEach
	public void setUp() {
	
		//Se crea el desarmador
		multiplo = new Multiplo();
		
	}
	
	/**
	 * Verifica cual es el multiplo mas alto que se encuentra entre 0 y 1000 pasando 3 y 9
	 */
	@Test
	public void multiploMasGrandeEntre3y9() {
		int mayorMultiplo = multiplo.mayorMultiploEntre(3, 9);
		
		assertEquals(mayorMultiplo, 999);
	}
	
	/**
	 * Verifica cual es el multiplo mas alto que se encuentra entre 0 y 1000, pasando 27 y 15
	 */
	@Test
	public void multiploMasGrandeEntre27y15() {
		int mayorMultiplo = multiplo.mayorMultiploEntre(27, 15);
		
		assertEquals(mayorMultiplo, 945);
	}
	
	/**
	 * Verifica cual es el multiplo mas alto que se encuentra entre 0 y 1000, pasando 753 y 15
	 */
	@Test
	public void multiploMasGrandeEntre753y15() {
		int mayorMultiplo = multiplo.mayorMultiploEntre(753, 15);
		
		assertEquals(mayorMultiplo, -1);
	}
}
