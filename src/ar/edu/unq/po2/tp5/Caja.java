package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja implements Agencia{

	public double registrarProductos(ArrayList<Producto> productos) {
		double montoTotal = 0;
		for (Producto producto:productos) {
			montoTotal += producto.getPrecio();
			producto.descontarStock(1);
		}
		
		return montoTotal;
	}
	
	public void registrarFacturas(ArrayList<Factura> facturas) {
		for(Factura factura:facturas) {
			this.registrarPago(factura);
		}
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		// no se si este metodo iba a aca o me falta algo
		//tiene que realizar algo mas?
	}
}
