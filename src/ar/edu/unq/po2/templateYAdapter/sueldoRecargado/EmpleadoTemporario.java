package ar.edu.unq.po2.templateYAdapter.sueldoRecargado;

public class EmpleadoTemporario extends Empleado{
	private int valorHora = 5;
	private double sueldoBasico;
	private int horasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;
	
	public EmpleadoTemporario(double sueldoBasico, int horasTrabajadas, boolean tieneHijos, boolean estaCasado) {
		this.sueldoBasico = sueldoBasico;
		this.horasTrabajadas = horasTrabajadas;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}
	@Override
	protected double calcularSueldoBase() {
		// TODO Auto-generated method stub
		return this.sueldoBasico + this.totalHoras();
	}

	@Override
	protected double calcularBeneficios() {
		// TODO Auto-generated method stub
		double valor = 0;
		if(this.tieneHijos || this.estaCasado) {valor= 100;}
		return valor;
	}
	
	private double totalHoras() {
		return this.valorHora * this.horasTrabajadas;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
}
