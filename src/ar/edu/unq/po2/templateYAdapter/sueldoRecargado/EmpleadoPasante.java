package ar.edu.unq.po2.templateYAdapter.sueldoRecargado;

public class EmpleadoPasante extends Empleado{
	private int valorHora = 40;
	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	protected double calcularSueldoBase() {
		// TODO Auto-generated method stub
		return this.valorHora * horasTrabajadas;
	}

	@Override
	protected double calcularBeneficios() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}

}
