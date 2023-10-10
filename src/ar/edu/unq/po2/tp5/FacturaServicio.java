package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura{

	private double costoPorUnidad;
	private int unidades;
	
	public FacturaServicio(double costo, int unidades) {
		this.costoPorUnidad = costo;
		this.unidades = unidades;
	}

	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return this.costoPorUnidad * this.unidades;
	}

}
