package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase - this.precioBase * 0.10;
	}

}
