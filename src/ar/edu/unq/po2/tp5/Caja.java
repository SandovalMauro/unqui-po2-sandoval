package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {

	public double registrarProductos(ArrayList<Producto> productos) {
		double montoTotal = 0;
		for (Producto producto:productos) {
			montoTotal += producto.getPrecio();
			producto.descontarStock(1);
		}
		
		return montoTotal;
	}
}
