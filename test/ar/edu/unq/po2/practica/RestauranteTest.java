package ar.edu.unq.po2.practica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestauranteTest {
	
	public Restaurante restaurante = new Restaurante();
	
	@BeforeEach
	public void setUp() {
		List<Plato> platos = new ArrayList<Plato>();
		platos.add(new Plato("Milanesa con fritas", 1500));
		platos.add(new Plato("Guiso de lentejas", 1800));
		platos.add(new Plato("Asado con ensalada", 2000));
		platos.add(new Plato("Tortilla de papas", 1400));
		
		this.restaurante.setPlatos(platos);
	}
	@Test
	void pruebaDeIva() {
		double precios = this.restaurante.sumarPlatosBaratos();
		assertEquals(precios, 3509);
	}

}
