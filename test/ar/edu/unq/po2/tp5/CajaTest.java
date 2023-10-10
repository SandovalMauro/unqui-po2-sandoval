package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Caja caja;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private ArrayList<Producto> productos;

	@BeforeEach
	void setUp() {
		caja = new Caja();
		producto1 = new ProductoCooperativa(1500, 100);
		producto2 = new ProductoEmpresa(1500, 50);
		producto3 = new ProductoCooperativa(900, 30);
		productos = new ArrayList<Producto>(Arrays.asList(producto1,producto2,producto3,producto1));
	}
	
	@Test
	void MontoDeRegistrarLosProductos() {
		double monto = caja.registrarProductos(productos);
		assertEquals(5010,monto);
	}

	@Test
	void StockLuegoDeRegistrarLosProductos() {
		caja.registrarProductos(productos);
		assertEquals(98,producto1.getStock());
		assertEquals(49,producto2.getStock());
		assertEquals(29,producto3.getStock());
	}
}
