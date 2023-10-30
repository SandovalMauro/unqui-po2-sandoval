package ar.edu.unq.po2.templateYAdapter.sueldoRecargado;

public class EmpleadoPlanta extends Empleado{

	private int valorPorHijo = 150;
	private int cantHijos;
	private double sueldoBasico;
	
	public EmpleadoPlanta(double sueldoBasico, int cantHijos) {
		this.sueldoBasico = sueldoBasico;
		this.cantHijos = cantHijos;
	}
	@Override
	protected double calcularSueldoBase() {
		// TODO Auto-generated method stub
		return this.sueldoBasico;
	}

	@Override
	protected double calcularBeneficios() {
		// TODO Auto-generated method stub
		return this.valorPorHijo * this.cantHijos;
	}

	
}
