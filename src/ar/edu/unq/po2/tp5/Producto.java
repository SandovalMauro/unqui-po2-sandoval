package ar.edu.unq.po2.tp5;

public abstract class Producto {
	
	protected double precioBase;
	private int stock;
	
	public Producto(double precio, int stock) {
		this.precioBase = precio;
		this.stock = stock;
	}
	
	public void setPrecio(double precio) {
		this.precioBase = precio;
	}

	public abstract double getPrecio();

	public void descontarStock(int i) {
		// TODO Auto-generated method stub
		this.stock -= i;
	}
	
	public void aumentarStock(int i) {
		// TODO Auto-generated method stub
		this.stock += i;
	}

	public int getStock() {
		return this.stock;
	}
}