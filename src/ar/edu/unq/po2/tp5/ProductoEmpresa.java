package ar.edu.unq.po2.tp5;

public class ProductoEmpresa extends Producto{

	public ProductoEmpresa(double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase;
	}

}
