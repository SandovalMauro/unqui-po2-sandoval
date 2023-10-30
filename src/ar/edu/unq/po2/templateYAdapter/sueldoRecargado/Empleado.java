package ar.edu.unq.po2.templateYAdapter.sueldoRecargado;

public abstract class Empleado {
	
	private double aporcentajeDeAportes = 0.13;

	private final double sueldo() {
		return this.sueldoBruto() - this.descuentosPorAportes();
	}

	private double descuentosPorAportes() {
		// TODO Auto-generated method stub
		return this.sueldoBruto() * this.aporcentajeDeAportes;
	}

	protected double sueldoBruto() {
		return this.calcularSueldoBase() + this.calcularBeneficios();
	}
	
	protected abstract double calcularSueldoBase();

	protected abstract double calcularBeneficios(); 
}
